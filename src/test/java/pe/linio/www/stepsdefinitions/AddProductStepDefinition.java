package pe.linio.www.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.linio.www.questions.ValidateResults;
import pe.linio.www.tasks.AddProduct;
import pe.linio.www.tasks.OpenBrowser;
import pe.linio.www.tasks.SearchProduct;
import pe.linio.www.userinterfaces.ElementsHomePages;

/**
 * Clase implementada para ejecutar los pasos
 * dados por el escenario trayendo las clases
 * implementadas dandole así a los pasos las acciones
 * 
 *@author Maria Vasquez
 */
public class AddProductStepDefinition {
	
	@Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor maria = Actor.named("Maria");
    private ElementsHomePages elementsHomePages;
  
    @Before
    public void setup() {
    	maria.can(BrowseTheWeb.with(webDriver));
    }
    
    @Given("^entrar al sitio web$")
    public void thatIEnterInWebsite() {
    	maria.attemptsTo(OpenBrowser.inform(elementsHomePages));
    }

    @When("^buscar el (.*)$")
    public void searchThe(String nameProduct) {
    	maria.attemptsTo(SearchProduct.search(nameProduct));
    }
    
     @And("^agregar product (.*)$")
    public void addTheProductInShoppingCar(String nameProduct) {
    	maria.attemptsTo(AddProduct.inShoppingCar());
    }
    
   @Then("^validar que el producto (.*) este en el carro de compras$")
    public void iValidateThatProductIsInShoppingCar(String expectResult) {
        maria.should(seeThat(ValidateResults.validate(), equalTo(expectResult)));
    }

}
