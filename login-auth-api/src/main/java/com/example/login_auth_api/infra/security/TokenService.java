package com.example.login_auth_api.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.example.login_auth_api.domain.user.User;

@Service
public class TokenService {

	@Value("${API_SECURITY_TOKEN_SECRET}")
	private String secret;

	public String generateToken(User user) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);
			String token = JWT.create().withIssuer("login-auth-api").withSubject(user.getEmail())
					.withExpiresAt(this.generateExpirationDate()).sign(algorithm);
			return token;

		} catch (JWTCreationException exception) {
			throw new RuntimeException("Erro enquanto estava autenticando");
		}
	}

	public String validateToken(String token) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);
			return JWT.require(algorithm).withIssuer("login-auth-api").build().verify(token).getSubject();

		} catch (JWTVerificationException exception) {
			return null;
		}
	}

	private Instant generateExpirationDate() {
		return LocalDateTime.now().plusHours(2).atZone(ZoneId.of("America/Sao_Paulo")).toInstant();
	}
}
