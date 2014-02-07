import org.grails.plugins.metrics.groovy.HealthChecks

class BootStrap {

    def dodgyStringReverserService

    def init = { servletContext ->
        HealthChecks.register("dodgyStringReverserService", dodgyStringReverserService)
    }

    def destroy = {
    }
}
