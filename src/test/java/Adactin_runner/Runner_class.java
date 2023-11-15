package Adactin_runner;


import Baseclass.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Adactin_runner\\Adactin_feature.feature", glue = "Adactin_runner", monochrome = false)

public class Runner_class extends Base_class {

    public static WebDriver driver;
    @BeforeClass
    public static void start(){
        driver=Base_class.browser_launch("chrome");
    }

    @AfterClass
    public  static void end(){
        driver.quit();
    }


}

