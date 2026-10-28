package Tasks;

<<<<<<< HEAD
import PageObjects.CheckoutPage;
=======
import Framework.Utils.FakersGeneration;
import PageObjects.CheckoutPage;
import Validacao.CheckoutValidacao;
>>>>>>> upstream/master
import Validacao.GenericValidacao;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

<<<<<<< HEAD
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



=======
    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidacao genericValidacao;
    private CheckoutValidacao checkoutValidacao;
    private FakersGeneration fakersGeneration;

    public CheckoutTask (WebDriver driver){

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
        checkoutValidacao = new CheckoutValidacao(this.driver);
        fakersGeneration = new FakersGeneration();
    }

    public void preencherCheckout() throws InterruptedException {

        genericValidacao.validationTitlePages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys(fakersGeneration.getFisrtName());
        Thread.sleep(1000);
        checkoutPage.getLastNameInput().sendKeys(fakersGeneration.getLastName());
        Thread.sleep(1000);
        checkoutPage.getZipCodeInput().sendKeys(fakersGeneration.getZipCode());
        Thread.sleep(1000);
        checkoutValidacao.validaForm();
        checkoutPage.getContinueButton().click();
        genericValidacao.validationTitlePages("Checkout: Overview");
        genericValidacao.validationProduto();


    }
>>>>>>> upstream/master
}
