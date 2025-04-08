package com.jenkins.demojenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoJenkinsApplicationTests {
	public static Logger logger = Logger.getLogger(DemoJenkinsApplication.class.getName());

	@Test
	void contextLoads() {
		logger.info("test case executed");

		assertEquals(true,true);
	}

}
