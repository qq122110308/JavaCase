package com.ry.test;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;


public class LogTest {
	
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(LogTest.class);
	
	public static void main(String[] args) {
		logger.info("info:пео╒111");
	}
}
