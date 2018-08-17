package me.ahmed.microservices.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class MessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void log(String msg) {
		System.out.println(msg);
	}

//	@StreamListener
//	public String sendTollCharge() {
//		return "{station:\"20\", customerid:\"100\", timestamp:\"2017-07-12T03:15:00\"}";
//	}

}
