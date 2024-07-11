package com.example.login_auth_api.infra.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	  @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("http://move-it-front.s3-website.us-east-2.amazonaws.com")
	                .allowedMethods("GET", "POST", "OPTIONS")
	                .allowedHeaders("*")
	                .allowCredentials(true);
	    }
}
