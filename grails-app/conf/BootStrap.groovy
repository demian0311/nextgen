import com.codahale.metrics.health.HealthCheckRegistry

class BootStrap {

    def init = { servletContext ->
        /*
        HealthCheckRegistry registry = new HealthCheckRegistry()

        registry.register(
                "dodgyStringReverser",
                new DodgyStringReversalServiceHealthCheck())
                */

    }
    def destroy = {
    }
}
