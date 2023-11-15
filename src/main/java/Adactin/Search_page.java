package Adactin;

import Baseclass.Base_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page extends Base_class
    {
//        public  static WebDriver driver;
//        helloooooooo
//        konruven

        public static WebDriver getDriver() {
        return driver;
    }



        @FindBy(xpath = "(//option[text()=\"London\"])")
        private WebElement london;
        @FindBy(xpath = "//option[text()=\"Hotel Sunshine\"]")
        private WebElement hotel;

        @FindBy(xpath = "//option[text()=\"Super Deluxe\"]")
        private WebElement Super;
        @FindBy(xpath = "//option[text()=\"1 - One\"]")
        private WebElement one;

        @FindBy(id="datepick_in")
        private WebElement pick;
        @FindBy(id="datepick_out")
        private WebElement out;

        public WebElement getLondon() {
            return london;
        }

        public WebElement getHotel() {
            return hotel;
        }

        public WebElement getSuper() {
            return Super;
        }

        public WebElement getOne() {
            return one;
        }

        public WebElement getPick() {
            return pick;
        }

        public WebElement getOut() {
            return out;
        }

        public WebElement getTwo() {
            return two;
        }

        public WebElement getZero() {
            return zero;
        }

        public WebElement getSubmit() {
            return Submit;
        }

        @FindBy(xpath = "(//option[text()=\"1 - One\"])[1]")
        private WebElement two;
        @FindBy(xpath = "(//option[text()=\"0 - None\"])[1]")
        private WebElement zero;
        @FindBy(id="Submit") public   WebElement Submit;

public Search_page(WebDriver driver)
        {
            Search_page.driver=driver;
            PageFactory.initElements(driver,this);
        }
    }

