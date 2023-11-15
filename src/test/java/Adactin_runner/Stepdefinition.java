package Adactin_runner;

import Adactin.Index_page;
import Adactin.Search_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Stepdefinition {
    public static WebDriver driver=Runner_class.driver;
    public static Index_page indexPage=new Index_page(driver);
    @Given("launch the url")
    public void launch_the_url() {
        driver.get("https://adactinhotelapp.com/index.php");

    }

    Search_page search_page =new Search_page(driver);

    @When("user enter the username")
    public void user_enter_the_username() {
        indexPage.getUsername().sendKeys("gayumadhu");
    }
    @When("user enter the password")
    public void user_enter_the_password() {
            indexPage.getPassword().sendKeys("6P66l2  ");
    }
    @Then("User click the login button")
    public void user_click_the_login_button() {
        indexPage.getLogin_btn().click();

    }

    @When("user select the location")
    public void user_select_the_location() {
        search_page.getLondon().click();

    }

    @When("user select the hotels")
    public void user_select_the_hotels() {
        search_page.getHotel().click();
         }

    @When("user select the room")
    public void user_select_the_room() {
        search_page.getSuper().click();
    }

    @When("User enter the check in date")
    public void user_enter_the_check_in_date() {
        search_page.getPick().click();
    }

    @When("user enter the check out date")
    public void user_enter_the_check_out_date() {
        search_page.getOut().click();
    }

    @When("user select the adults per room")
    public void user_select_the_adults_per_room() {
        search_page.getTwo().click();
          }

    @When("user select children per room")
    public void user_select_children_per_room() {
        search_page.getZero().click();

    }

    @Then("User click the search button")
    public void user_click_the_search_button() {
        search_page.getSubmit().click();
         }




}
