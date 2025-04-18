package edu.pzks.keycloakproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;


@Configuration
public class SecurityBean {

    @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private  String issuerUri;

    @Bean
    public JwtDecoder jwtDecoder(OAuth2ResourceServerProperties properties) {
        return JwtDecoders.fromOidcIssuerLocation(issuerUri);
    }



}