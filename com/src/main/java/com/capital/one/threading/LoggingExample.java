package com.capital.one.threading;

import org.apache.log4j.Logger;

public class LoggingExample {
	
	private  static Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
	log.trace("trace messgae");
	log.debug("debug messgae");
	log.info("info messgae");
	log.warn("warn messgae");
	log.error("object message");
	
	}

}
