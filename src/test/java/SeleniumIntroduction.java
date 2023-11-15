import Baseclass.Base_class;
import Select.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;

public class SeleniumIntroduction extends Base_class {
    public static void main(String[] args) throws InterruptedException {
        //webDriverManager.Chromedriver().setup();//
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        JavascriptExecutor og=(JavascriptExecutor)driver;
        og.executeScript("window.scrollBy(0,300000)");

        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("gayathri");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("gayu");
        WebElement a=driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
        a.click();
        WebElement d=driver.findElement(By.xpath("//input[@id=\"exp-1\"]"));
        d.click();
        WebElement g= driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
        g.sendKeys("25/08/2025");
        driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Continents\"]")).click();
        WebElement dropdown=driver.findElement(By.xpath("//span[text()=\"Continents\"]"));
        dropdown.findElement(By.xpath("//option[text()=\"Europe\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Selenium Commands\"]")).click();
        WebElement dropdown1=driver.findElement(By.xpath("//span[text()=\"Selenium Commands\"]"));
        dropdown1.findElement(By.xpath("//option[text()=\"Browser Commands\"]")).click();
        og.executeScript("window.scrollTo(0,675.5555419921875)");
        driver.findElement(By.id("submit")).click();


        Thread.sleep(20000);

        driver.quit();

    }
}


