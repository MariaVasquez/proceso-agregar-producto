package pe.linio.www.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;

/**
 * Clase implementada para Mapear los elementos necesario de la
 * página para realizar las acciones 
 * 
 * @author Maria Vasquez
 *
 */

@DefaultUrl("https://www.linio.com.pe/.")
public class ElementsHomePages extends PageObject {
        public static Target INPUT_SEARCH = Target.the("Ingresa producto al campo de busqueda").located(By.name("q"));
        public static Target BUTTON_SEARCH = Target.the("Dar clic al botón de busqueda")
                        .locatedBy("//div[@class='input-group-btn']/button");
        public static Target RESULTS_SEARCHS = Target.the("Obteniendo todos los productos de la busqueda")
                        .located(By.xpath("//span[@class='title-section']"));
        public static Target WAIT_PRODUCT_NAME = Target.the("Espera a que la página para agregar el producto cargue")
                        .located(By.className("product-title"));
        public static Target BUTTON_ADD_PRODUCT = Target.the("Clic al boton Agregar producto")
                        .locatedBy("//input[@id='selected-option']/following-sibling::button");
        public static Target SHOPPING_CAR_BUTTON = Target.the("Clic al boton carro de compra")
                        .locatedBy("//a[text()='Ir al carrito']");
        public static Target PRODUCT_NAME = Target.the("Obteniendo el nombre del producto del carro de compras")
                        .located(By.xpath("//div[@class='item-title col-md-12 col-sm-11 col-xs-10']/span/a"));

}
