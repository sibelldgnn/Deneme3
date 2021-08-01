package Drivers;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import javassist.tools.web.Webserver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Driver {

    public static WebDriver webDriver;


    /*public static void main(String deger){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sibel.dogan\\IdeaProjects\\chromedriver.exe");
        WebDriver Driver= new ChromeDriver();

        if(deger.equals("Chrome"))
        {

            String baseUrl=("https://www.n11.com/");
            Driver.get(baseUrl);
            Driver.findElement(By.className("btnHolder")).click();
        }

 }*/

    @BeforeSuite
    public void initializeDriver(){
        webDriver =DriverFactory.getDriver();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
        String baseUrl=("https://www.eminevim.com/");
        webDriver.get(baseUrl);
        System.out.println("Sayfa Yuklendi");

    }
   /* @AfterSuite
    public void QuitDriver()
    {
        webDriver.quit();
    }*/
}
