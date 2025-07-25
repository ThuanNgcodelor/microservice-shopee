package com.example.gateway.config;

import com.example.gateway.filter.JwtAuthenticationFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    private final JwtAuthenticationFilter filter;

    public GatewayConfig(JwtAuthenticationFilter filter) {
        this.filter = filter;
    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("auth-service", r -> r.path("/v1/auth/**")
                        .uri("lb://auth-service"))

                .route("user-service", r -> r.path("/v1/user/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://user-service"))

                .route("stock-domains", r -> r.path("/v1/stock/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://stock-service"))

                .route("file-storage",r->r.path("/v1/file-storage/**")
                        .filters(f->f.filter(filter))
                        .uri("lb://file-storage"))

                .route("job-service", r -> r.path("/v1/job-service/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://job-service"))

                .route("notification-service", r -> r.path("/v1/notification/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://notification-service"))

                .route("order-service", r -> r.path("/v1/order/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://order-service"))

                .build();
    }
}