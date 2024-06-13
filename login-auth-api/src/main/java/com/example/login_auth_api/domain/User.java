package com.example.login_auth_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor	
@Table(name="users")
public class User {
	
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id private String id;
	private String name;
	private String email;
	private String password;

	
	

}
