package Adactin;

import Baseclass.Base_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_page extends Base_class {
//    public static WebDriver driver;

    @FindBy(id = "username") private WebElement username;
    @FindBy(id = "password") private WebElement password;

    @FindBy(id = "login") private WebElement login_btn;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogin_btn() {
        return login_btn;
    }

    public Index_page(WebDriver driver){
        Index_page.driver = driver;
        PageFactory.initElements(driver,this);

    }

}
