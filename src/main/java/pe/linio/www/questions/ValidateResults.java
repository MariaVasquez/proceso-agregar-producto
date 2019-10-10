package pe.linio.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.linio.www.userinterfaces.ElementsHomePages;

/**
 * Question para validar que el producto que esta en el carrito, corresponde al producto buscado
 *
 * @author Maria Vasquez
 */


public class ValidateResults implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ElementsHomePages.PRODUCT_NAME).viewedBy(actor).asString();
	}
	
	public static ValidateResults validate() {
		return new ValidateResults();
	}

}
