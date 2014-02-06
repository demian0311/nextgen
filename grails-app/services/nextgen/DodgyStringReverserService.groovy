package nextgen

import com.codahale.metrics.health.HealthCheck
import com.neidetcher.hcbp.util.HystrixConfigurationUtility
import com.netflix.hystrix.HystrixCommand
import com.netflix.hystrix.HystrixCommandGroupKey

class DodgyStringReverserService extends HealthCheck{

    def reverse(String stringIn) {
        return (new DodgyStringReverserCommand(stringIn)).execute()
    }

    def String ping(){
       "pong"
    }

    @Override def HealthCheck.Result check() throws Exception{
        return HealthCheck.Result.healthy()
    }
}

class DodgyStringReverserCommand extends HystrixCommand {
    String someState

    static HystrixCommand.Setter createHystrixCommandSetter(){
        HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(this.class.name))
                .andCommandPropertiesDefaults(
                HystrixConfigurationUtility.createHystrixCommandPropertiesSetter().withCircuitBreakerEnabled(true)
                        .withCircuitBreakerSleepWindowInMilliseconds(1000))
    }

    def DodgyStringReverserCommand(String stringIn){
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
