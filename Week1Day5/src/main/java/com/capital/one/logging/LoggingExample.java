package com.capital.one.logging;

import org.apache.log4j.Logger;

import com.capital.one.factory.example.HondaFactory;

public class LoggingExample {
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {
		log.trace("trace message");
		log.debug("debug message");
		log.info("info message");
		log.warn("warn message");
		log.error("error message");
		log.fatal("fatal message");
		
		HondaFactory hf = new HondaFactory();
		log.trace(hf.getCar("civic", "white"));
	}
}
