package vTiger.genericLibrary;

import org.apache.logging.log4j.*;
public class k1 {
	
	private static Logger log=LogManager.getLogger(k1.class.getName());
	public static void main(String[] args) {
		log.info("logger");
		log.error("loged to app");
		System.out.println("learning log4j");
	}

}
