package com.backend.cors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
	
	@Value("${allowed.origin}")
	private String ourOrigin;
	
	@Bean
	public WebMvcConfigurer configMethod() {
		return new WebMvcConfigurer() {
			@Override
			// Special methods associated with the WebMvcConfigurer object:
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins(ourOrigin)
						.allowedMethods("POST")
						.allowedHeaders("*");
			}
		};
	}
}
