package com.valdisnei.biblioteca.config.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Permitir solicitações de qualquer origem (não recomendado em produção)
        config.addAllowedHeader("*"); // Permitir cabeçalhos personalizados
        config.addAllowedMethod("*"); // Permitir todos os métodos HTTP
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}