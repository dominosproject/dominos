package Baseclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
    public static WebDriver driver;
    public static WebElement e;

    public static WebDriver browser_launch(String name) {
        if (name.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (name.equals("firefox")9    ) {
            driver = new FirefoxDriver();
        } else if (name.equals("edge")) {
            driver = new EdgeDriver();

        }
        return driver;

    }




    public static void jsexecuter(String arguments, WebElement refname) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(arguments, refname);
    }

    public static void select_index(WebElement refname, int index) {
        Select obj = new Select(refname);
        obj.selectByIndex(index);
    }

    public static void click() {

    }
    public static void selectByValue(String value){
        Select s=new Select(e);
        s.selectByValue((value));

    }

}
