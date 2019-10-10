package pe.linio.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pe.linio.www.userinterfaces.ElementsHomePages;

/**
 * Clase implementada para buscar un producto con la información
 * dada desde el escenario 
 *
 * @author Maria Vasquez
 */

public class SearchProduct implements net.serenitybdd.screenplay.Task {

    private String nameProduct;

    public SearchProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade search = ElementsHomePages.INPUT_SEARCH.resolveAllFor(actor).get(1);
        actor.attemptsTo(Enter.theValue(nameProduct).into(search), Click.on(ElementsHomePages.BUTTON_SEARCH));

        List<WebElementFacade> listResult = ElementsHomePages.RESULTS_SEARCHS.resolveAllFor(actor);
        for (WebElementFacade productResult : listResult) {
            String[] productWeb = productResult.getText().split("\\s[+][.]{3}|[.]{3}|\\s[-][.]{3}|[-][.]{3}");
            String[] productDataTest = nameProduct.split("\\s[+]");

            if (productDataTest[0].equals(productWeb[0])) {
                actor.attemptsTo(
                    Click.on("//span[text()='"+productResult.getText()+"']")
                );
                break;
            }
        }

    }

    public static SearchProduct search(String nameProduct) {
        return instrumented(SearchProduct.class, nameProduct);
    }

}
