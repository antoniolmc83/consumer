package com.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;


@Configuration
@EnableBinding(Sink.class)
public class EventSink {
	private static Logger logger = LoggerFactory.getLogger(EventSink.class);
	
    @StreamListener( Sink.INPUT)
    public void loggerSink(String sinkTimedMessage) {
    	
        logger.info("Received: " + sinkTimedMessage.toString());
    }	
	
//	@Bean
//	@Scope("prototype")
//	Logger logger(InjectionPoint ip){
//		return Logger.getLogger(ip.getDeclaredType().getName());
//	}
//	
//	
//	@Bean
//	IntegrationFlow integrationFlow(Logger logger, ConsumerChannels c){
//		return IntegrationFlows.from(c.source()).
//				handle(String.class, (payload, headers) ->{
//				logger.info("new message " + payload);
//			return null;
//		}).get();
//	}
//	
}
