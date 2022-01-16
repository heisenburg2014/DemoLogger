import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLogger {
    private static Logger logger = LogManager.getLogger(DemoLogger.class);

    public static void main(String args[]) {
        System.out.println("2 Rupee ki Pepsi, Shiwani is sexy *_*");
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");

    }
}
