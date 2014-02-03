## Get things going
First start up the NextGen Grails application.
```
demian@kabar-7 ~/code/nextgen>./grailsw run-app
```

You can test the API by going here:
[http://localhost:8080/nextgen/test/index](http://localhost:8080/nextgen/test/index)

You might see a little bit of JSON.
``` json
{"result": "OOF" }
```

We do a little bit of randomness to simulate indeterminate
behavior.  The duration of the call might be different
and sometimes you'll get back a 500.

## Hystrix

### Look at the Hystrix Stream
You can go here to see the stream: 
[http://localhost:8080/nextgen/hystrix.stream](http://localhost:8080/nextgen/hystrix.stream)

### Use the Hystrix Dashboard
```
demian@kabar-7 ~/code/Hystrix/hystrix-dashboard>../gradlew jettyRun
:hystrix-dashboard:compileJava UP-TO-DATE
:hystrix-dashboard:processResources UP-TO-DATE
:hystrix-dashboard:classes UP-TO-DATE
:hystrix-dashboard:jettyRun
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
log4j:WARN No such property [httpclient] in org.apache.log4j.ConsoleAppender.
> Building > :hystrix-dashboard:jettyRun > Running at http://localhost:7979/hystrix-dashboard
```

Now go here to see the dashboard: [http://localhost:7979/hystrix-dashboard](http://localhost:7979/hystrix-dashboard)

## Yammer Metrics
Metrics are on this endpoint: http://localhost:8080/nextgen/metrics
