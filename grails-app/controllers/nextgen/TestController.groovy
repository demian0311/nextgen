package nextgen

import org.grails.plugins.metrics.groovy.Timed

class TestController {

    def dodgyStringReverserService

    @Timed
    def index() {
        String stringIn = request.getParameter("string")
        String result = dodgyStringReverserService.reverse(stringIn)
        //log.info("result: " + result)
        render("""{"result": "${result}" }\n""")
    }
}
