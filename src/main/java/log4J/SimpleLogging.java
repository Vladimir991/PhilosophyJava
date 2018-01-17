package log4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Vladimir Glinskikh on 17.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class SimpleLogging {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SimpleLogging.class);

        System.out.println("Заказ оформлен!");
        logger.info("Hello this is an info message!");
    }
}
