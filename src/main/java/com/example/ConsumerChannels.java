package com.example;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

interface ConsumerChannels{
	
	String INPUT = "source";
	
	@Input
	SubscribableChannel source();
	
//	@Output
//	MessageChannel sink();
}