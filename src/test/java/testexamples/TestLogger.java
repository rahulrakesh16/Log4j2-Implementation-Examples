package testexamples;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class TestLogger  {

    private static final Logger logger = LogManager.getLogger(TestLogger.class.getName());
   
    public static void main(String args[]) throws IOException {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        File file = new File("./log4j2.xml");
        context.setConfigLocation(file.toURI());
        for (int i = 0; i < 100; i++) {
            logger.info("Test" + i);
            logger.error("Test" + i);
            logger.debug("Test" + i);
            logger.warn("Test" + i);
        }
    }
} 