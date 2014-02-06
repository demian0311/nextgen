<!DOCTYPE html>
<html>
	<head>
		<title>Nextgen</title>
        <link rel="stylesheet" type="text/css" href="css/main.css"/>
	</head>
	<body>
        <h1 class="center">Nextgen</h1>

        <table class="center">
            <tr>
                <th colspan="2">Demo Links</th>
            </tr>
            <tr>
                <td><a href="test?string=HelloWorld">Test functionality</a></td>
                <td>hit our internal bad behaving JSON API</td>
            </tr>
            <tr>
                <td><a href="hystrix.stream">Hystrix Stream</a></td>
                <td>our own Hystrix Stream</td>
            </tr>
            <tr>
                <td><a href="http://localhost:7979/hystrix-dashboard/monitor/monitor.html?stream=http%3A%2F%2Flocalhost%3A8080%2Fnextgen%2Fhystrix.stream">Hystrix Dashboard</a></td>
                <td>Need to have hystrix-dashboard project running on 7979</td>
            </tr>
            <tr>
                <td><a href="metrics">Yammer Metrics</a></td>
                <td>Metrics, Ping, Threads, Healthcheck</td>
            </tr>
        </table>


        <table class="center">
            <tr>
                <th colspan="2">GitHub Links to Projects</th>
            </tr>
            <tr>
                <td><a href="https://github.com/demian0311/nextgen">Nextgen</a></td>
                <td>This project, shows usage of circuit breaker and metrics.</td>
            </tr>
            <tr>
                <td><a href="https://github.com/demian0311/hystrix-circuit-breaker">Hystrix Circuit Breaker</a></td>
                <td>Grails plugin to include and make available Hystrix Circuit Breaker</td>
            </tr>
            <tr>
                <td><a href="https://github.com/jeffellis/grails-yammer-metrics">Yammer Metrics</a></td>
                <td>Grails plugin to include and make available Yammer Metrics</td>
            </tr>

            <tr>
                <td><a href="https://github.com/Netflix/Hystrix">Hystrix</a></td>
                <td>Contains a Hystrix Dashboard to view circuit breakers</td>
            </tr>

        </table>
    </body>
</html>
