package com.bpower2.tmpgatewayservice.routes.formsservice;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;

import java.util.function.Function;

public interface ServiceRoute {

    Function<PredicateSpec, Buildable<Route>> getRoute();

}
