package com.bpower2.tmpgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TmpGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmpGatewayServiceApplication.class, args);
    }

//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("FormsService", formsService -> formsService
//                        .path("/v1/formModels/**")
//                        .filters(f -> f.rewritePath("/v1/formModels/?<PVARS>.*", "/v1/formModels/${PVARS}"))
//                        .uri("http://srv19.mikr.us:20168")
//                )
//                .build();
//    }

}
