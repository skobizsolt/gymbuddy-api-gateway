package com.gymbuddy.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GymbuddyApiGatewayApplicationTests {

	private final ApplicationContext context;

	GymbuddyApiGatewayApplicationTests(ApplicationContext context) {
		this.context = context;
	}

	@Test
	void contextLoads() {
		assertEquals("gymbuddy-api-gateway", context.getId());
	}

}
