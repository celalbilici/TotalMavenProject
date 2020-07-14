package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4JDemo {
    private static Logger logger = LogManager.getLogger(Log4JDemo.class);
    public static void main(String[] args){
        System.out.println("hello world");
        logger.trace("This is a trace message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
        System.out.println("completed");
    }
}
