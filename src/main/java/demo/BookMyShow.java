package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
    ChromeDriver driver;
    public void bookmyshow(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
     public void endTest(){
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public  void testCase01(){
         //get the url
    driver.get("https://in.bookmyshow.com/explore/home/chennai");
   
   //get all hyperlink
   List <WebElement> hyperlink = driver.findElements(By.tagName("a"));
   //get the count of hyperlink in home pae of bms
   int hyperlinks = hyperlink.size();
   System.out.println("all the hyperlink in bookmyshow home page" + hyperlinks );
}
}