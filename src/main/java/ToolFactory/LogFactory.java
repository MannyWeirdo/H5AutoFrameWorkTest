package ToolFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFactory {

    public static Logger getLogger(Class<?> clazz) {
        final Logger logger = LoggerFactory.getLogger(clazz);
        return logger;
    }
}
