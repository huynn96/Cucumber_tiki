package vn.viettel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StepDefinitions {
    WebDriver driver = Hook.driver;
    WebDriverWait wait = Hook.wait;

    @Given("^The homepage is displayed$")
    public void the_homepage_is_displayed() throws Throwable {
        this.driver.get("https://tiki.vn");
    }

    @When("^The user search product$")
    public void the_user_search_product() throws Throwable {
        WebElement inputSearch = this.driver.findElement(By.xpath("//input[@type='text']"));
        inputSearch.sendKeys("rubik");
        inputSearch.sendKeys(Keys.ENTER);
    }

    @Then("^The checkout page is displayed$")
    public void the_checkout_page_is_displayed() throws Throwable {
        WebElement inputEmail = this.driver.findElement(By.xpath("//div[@class='ReactModalPortal']//input[@name='email']"));
        Assert.assertTrue(inputEmail.isDisplayed());
    }

    @And("^The user choose item to card$")
    public void the_user_choose_item_to_card() throws Throwable {
        WebElement firstItem = this.driver.findElement(By.xpath("(//a[@class='search-a-product-item'])[1]"));
        firstItem.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addToCart = this.driver.findElement(By.xpath("//button[@class='btn btn-add-to-cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }

    @And("^The user checkout the card$")
    public void the_user_checkout_the_card() throws Throwable {
        WebElement iconCart = this.driver.findElement(By.xpath("//i[@class='tikicon icon-cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(iconCart)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cartSubmit = this.driver.findElement(By.xpath("//button[@class='cart__submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(cartSubmit)).click();
    }
}
