package Tasks;

import PageObjects.CartPage;
import PageObjects.ProdutoPage;
import Validacao.GenericValidacao;
import org.openqa.selenium.WebDriver;

public class ProdutoTask {

    private WebDriver driver;
    private ProdutoPage produtoPage;
<<<<<<< HEAD
    private GenericValidacao genericvalidacao;
=======
    private GenericValidacao genericValidacao;
>>>>>>> upstream/master
    private CartPage cartPage;

    public ProdutoTask (WebDriver driver){

        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
<<<<<<< HEAD
        genericvalidacao = new GenericValidacao(this.driver);
=======
        genericValidacao = new GenericValidacao(this.driver);
>>>>>>> upstream/master
        cartPage = new CartPage(this.driver);
    }

    public void selecionarProduto() throws  InterruptedException{

        produtoPage.getAddToCartButton().click();
        Thread.sleep(5000);
        produtoPage.getCartButton().click();
<<<<<<< HEAD
        Thread.sleep(5000);
        genericvalidacao.validationTitlePage("your cart");
        genericvalidacao.validationProduto();
        Thread.sleep(5000);
        cartPage.getCheckoutBtton().click();;
=======
        genericValidacao.validationTitlePages("Your Cart");
        genericValidacao.validationProduto();
        cartPage.getCheckoutButton().click();
>>>>>>> upstream/master

    }

}
