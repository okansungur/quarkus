package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import io.quarkus.vertx.http.runtime.filters.Filters;


@ApplicationScoped
public class AppRoutes {

public void filters(@Observes Filters filters) {
    filters
    .register(
    rc -> {
    rc.response()
    .putHeader("x-request-id", "The header is here");
    rc.next();
    },
    10);
    }


}