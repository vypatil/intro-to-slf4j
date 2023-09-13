package com.prowings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j2 {
	
	public static final	Logger logger = LoggerFactory.getLogger(TestLog4j2.class);
	
	public static void myMain() {
		
		logger.info("TestLog4j2 = An INFO message");
		logger.debug("TestLog4j2 = An debug message");
		logger.trace("TestLog4j2 = An trace message");
		logger.warn("TestLog4j2 = An warn message");
		logger.error("TestLog4j2 = An error message");
		
		System.out.println(" Run completed TestLog4j2 ");
		
		
	}

}
