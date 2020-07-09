package org.agoncal.fascicle.quarkus.observability.health.liveready;

import io.smallrye.health.HealthStatus;
import io.smallrye.health.checks.UrlHealthCheck;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

// tag::adocSnippet[]
@ApplicationScoped
public class DatabaseCheck {

  @Liveness
  HealthCheck check1() {
    return HealthStatus.up("successful-live");
  }

  @Readiness
  HealthCheck check2() {
    return HealthStatus.state("successful-read", this::isReady);
  }

  @Liveness
  HealthCheck checkURL() {
    return new UrlHealthCheck("https://www.google.com")
      .name("Google-Check");
  }

  private boolean isReady() {
    return true;
  }
}
// end::adocSnippet[]