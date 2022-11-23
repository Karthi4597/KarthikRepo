package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<Configuration status="WARN">
	  <Appenders>
	    <Console name="Console" target="SYSTEM_OUT">
	      <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
	    </Console>
	  </Appenders>
	  <Loggers>
	    <Root level="error">
	      <AppenderRef ref="Console"/>
	    </Root>
	  </Loggers>
	</Configuration>
	
}


