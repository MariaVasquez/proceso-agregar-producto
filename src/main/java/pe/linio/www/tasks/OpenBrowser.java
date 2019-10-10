package pe.linio.www.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.core.pages.PageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase implementada para dar la acción de abrir el navegador 
 * con la url parametrizada por defecto
 * 
 * @author Maria Vasquez
 *
 */

public class OpenBrowser implements net.serenitybdd.screenplay.Task{
    private PageObject pageObject;

    public OpenBrowser(PageObject pageObject){
        this.pageObject = pageObject;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn(pageObject)
        );
    }

    public static OpenBrowser inform(PageObject pageObject) {
        return instrumented(OpenBrowser.class, pageObject);
    }
}
