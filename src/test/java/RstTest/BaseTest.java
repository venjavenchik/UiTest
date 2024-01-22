package RstTest;

import ConfRead.ConfigProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverRunner;

abstract public class BaseTest {

    @BeforeEach
    public void setUp() {
        WebDriverRunner.setDriver(new ChromeDriver());
        WebDriverRunner.getDriver().get(ConfigProvider.URL);
    }

//    @AfterEach
//    public void tearDown() {
//
//        WebDriverRunner.quiteDriver();
//    }
}
