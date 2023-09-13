package com.prowings;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {

	public static final Logger logger = LoggerFactory.getLogger(TestLog4j.class);
//	    public static final Logger logger = LogManager.getLogger(TestLog4j.class);

	public static void main(String[] args) throws InterruptedException {

		long startTime = System.currentTimeMillis();
		long duration = 10 * 1000;

		while (System.currentTimeMillis() - startTime < duration) {

			logger.info("An INFO message");
			logger.debug("A DEBUB message");
			logger.trace("A TRACE message");
			logger.warn("A WARN message");
			logger.error("A ERROR message");

		}

//        Thread.sleep(15000);

		TestLog4j2.myMain();

		System.out.println("Run complete");

	}

}