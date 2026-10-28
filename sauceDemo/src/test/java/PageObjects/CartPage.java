package PageObjects;

<<<<<<< HEAD
=======
import Framework.Browser.Waits;
>>>>>>> upstream/master
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;
<<<<<<< HEAD

    public  CartPage (WebDriver driver){

        this.driver = driver;

    }
    public WebElement getCheckoutBtton(){

        return driver.findElement(By.id("checkout"));


    }


}


=======
    private Waits waits;

    public CartPage(WebDriver driver){

        this.driver = driver;
        this.waits = new Waits(this.driver);
    }

    public WebElement getCheckoutButton(){

        waits.visbilityOfElement(By.id("checkout"));
        return driver.findElement(By.id("checkout"));
    }
}
>>>>>>> upstream/master
