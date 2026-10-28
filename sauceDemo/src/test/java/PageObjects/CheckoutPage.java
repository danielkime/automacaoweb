package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;

<<<<<<< HEAD
    public CheckoutPage(WebDriver driver) {
=======
    public CheckoutPage(WebDriver driver){
>>>>>>> upstream/master

        this.driver = driver;
    }

<<<<<<< HEAD
    public WebElement getFirstNameInput() {

        return driver.findElement(By.id("first name"));

    }

    public WebElement getLastNameInput() {

        return driver.findElement(By.id("last name"));
    }
    public WebElement getZipCodeInput() {

        return driver.findElement(By.id("potal-code"));
    }

    public WebElement getContinueInput() {
=======
    public WebElement getFirstNameInput(){

        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastNameInput(){

        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipCodeInput(){

        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton(){
>>>>>>> upstream/master

        return driver.findElement(By.id("continue"));
    }

<<<<<<< HEAD
}
=======

}
>>>>>>> upstream/master
