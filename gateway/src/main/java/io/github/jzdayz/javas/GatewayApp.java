package io.github.jzdayz.javas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import reactor.core.publisher.Hooks;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApp {

	public static void main(String[] args) {
		Hooks.onOperatorDebug();
		SpringApplication.run(GatewayApp.class, args);
	}

}
