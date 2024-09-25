package org.erc.log4j2.layout.examples.basic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    
	private static final Logger logger = LogManager.getLogger(Main.class);
	
    public static void main(String[] args){
    	logger.debug("Debug line");
        try {
            main1(args);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static void main1(String[] args) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
