package pe.linio.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static pe.linio.www.userinterfaces.ElementsHomePages.BUTTON_ADD_PRODUCT;
import static pe.linio.www.userinterfaces.ElementsHomePages.SHOPPING_CAR_BUTTON;
import static pe.linio.www.userinterfaces.ElementsHomePages.WAIT_PRODUCT_NAME;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * Clase implementada para agregar el producto con las acciones 
 * de cliqueo
 *
 * @author Maria Vasquez
 */

public class AddProduct implements net.serenitybdd.screenplay.Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(WAIT_PRODUCT_NAME, isPresent()),
				Click.on(BUTTON_ADD_PRODUCT),
				WaitUntil.the(SHOPPING_CAR_BUTTON, isPresent()),
                Click.on(SHOPPING_CAR_BUTTON)
        );
		
	}

	 public static AddProduct inShoppingCar() {
	        return instrumented(AddProduct.class);
	    }

}
