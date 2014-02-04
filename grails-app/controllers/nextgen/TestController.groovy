package nextgen

import org.grails.plugins.metrics.groovy.Timed

class TestController {

    def dodgyStringReverserService

    @Timed
    def index() {
        // TODO: this would be more believable if it took a parameter

        String result = dodgyStringReverserService.reverse("FOO")
        log.info("result: " + result)
        render("""{"result": "${result}" }\n""")
    }
}
