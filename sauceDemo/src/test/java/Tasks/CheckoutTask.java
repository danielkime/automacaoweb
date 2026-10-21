package Tasks;

import PageObjects.CheckoutPage;
import Validacao.GenericValidacao;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

   private WebDriver driver;
   private CheckoutPage checkoutPage;
   private GenericValidacao genericValidacao;

   public CheckoutTask (WebDriver driver){

       this.driver = driver;
       checkoutPage = new CheckoutPage(this.driver);
       genericValidacao = new GenericValidacao(this.driver);

   }
   public  void preencherCheckout(){

       genericValidacao.validationTitlePage("checkout:your information");
       checkoutPage.getFirstNameInput().sendKeys("francielle");
       checkoutPage.getLastNameInput().sendKeys("vareira");
       checkoutPage.getZipCodeInput().sendKeys("1234566");
       checkoutPage.getContinueInput().click();
       genericValidacao.validationTitlePage("checkout : Overview");
       genericValidacao.validationProduto();

   }



}
