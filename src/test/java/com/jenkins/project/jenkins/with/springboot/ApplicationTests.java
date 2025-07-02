package com.jenkins.project.jenkins.with.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info(()->"Testing Done");
		logger.info(()->"Testing Done 2");
		logger.info(()->"Testing Done 3");
		assertEquals(true, true);
	}

}
