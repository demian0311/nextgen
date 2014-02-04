package nextgen

import org.grails.plugins.metrics.groovy.Timed

class TestController {

    def dodgyStringReverserService

    @Timed
    def index() {
        // TODO: this would be more believable if it took a parameter
        //println("request: " + request.getParameter("string"))
        String stringIn = request.getParameter("string")

        String result = dodgyStringReverserService.reverse(stringIn)
        log.info("result: " + result)
        render("""{"result": "${result}" }\n""")
    }
}
