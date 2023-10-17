package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
    ChromeDriver driver;

 public void   amazon(){
 System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
    driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("amazon");
        searchBox.submit();

        WebElement searchresult = driver.findElement(By.className("srp"));

        boolean foundAmazon = driver.getPageSource().contains("amazon.in") || driver.getPageSource().contains("amazon.com");

        if (foundAmazon) {
            System.out.println("Amazon found in the search results");
        } else {
            System.out.println("Amazon not found in the search results");
        }

        driver.quit();
    }
}
