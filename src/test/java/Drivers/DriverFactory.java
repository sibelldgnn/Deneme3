package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

   // public static
    public static WebDriver getDriver()
    {
        String Browser = "FIREFOX";
        switch (Browser)
        {
            case "IE" :
                WebDriverManager.iedriver().setup();
                return  new InternetExplorerDriver();
            case "CHROME" :
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "FIREFOX":
            default:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

        }
    }
}
