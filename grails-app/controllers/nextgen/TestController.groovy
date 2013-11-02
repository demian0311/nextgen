package nextgen

import com.neidetcher.hcbp.util.HystrixConfigurationUtility
import com.netflix.hystrix.*
import org.grails.plugins.yammermetrics.groovy.Timed

class TestController {

    @Timed
    def index() {
        String result = (new DodgyStringReverser("FOO")).execute()
        log.info("result: " + result)

        render("""{"result": "${result}" }\n""")
    }
}

class DodgyStringReverser extends HystrixCommand {
    String someState

    static HystrixCommand.Setter createHystrixCommandSetter(){
        HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(this.class.name))
                .andCommandPropertiesDefaults(
                HystrixConfigurationUtility.createHystrixCommandPropertiesSetter().withCircuitBreakerEnabled(true)
                        .withCircuitBreakerSleepWindowInMilliseconds(1000))
    }


    def DodgyStringReverser(String stringIn){
        super(createHystrixCommandSetter())
        println("command created")
        someState = stringIn
    }

    @Override
    def String run(){
        println("command called")
        def multiplier = (Math.random() * 100).toInteger()
        println("multiplier: " + multiplier)

        // indeterminate behavior
        if(multiplier % 9 == 0){
            throw new RuntimeException("something bad happened")
        } else if(multiplier % 21 == 0){
            Thread.sleep(10 * 1000)
        } else {
            Thread.sleep(multiplier * 10)
        }

        someState.reverse()
    }
}
