package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManage {
    private static WebDriver driver;

    private DriverManage() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("creating driver");
        }
        return driver;
    }

    public static void kill() {
        if (driver != null) {
            driver.quit();
            driver = null;
            System.out.println("driver was killed successfully");
        } else
            System.out.println("null error at killing driver");
    }
}
