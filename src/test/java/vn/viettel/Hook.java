package vn.viettel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hook {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void InitTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huy\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }


    @After
    public void AfterTest() {
        driver.quit();
    }
}
