package com.example.login_auth_api.infra.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	  @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("https://d3lxw8jx8leguy.cloudfront.net")
	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
	                .allowedHeaders("*")
	                .allowCredentials(true);
	    }
}
