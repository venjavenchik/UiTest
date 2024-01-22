package utils;

import org.openqa.selenium.WebDriver;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WebDriverRunner {

    private static final Map<Long, WebDriver> DRIVER_MAP = new ConcurrentHashMap<>();

    public static void setDriver(WebDriver driver) {
        DRIVER_MAP.put(Thread.currentThread().threadId(), driver);
    }

    public static WebDriver getDriver() {
        return DRIVER_MAP.get(Thread.currentThread().threadId());
    }

    public static void quiteDriver() {
        long id = Thread.currentThread().threadId();
        DRIVER_MAP.get(id).quit();
        DRIVER_MAP.remove(id);
    }
}
