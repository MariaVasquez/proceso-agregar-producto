package pe.linio.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * Clase implementada para correr el escenario dado
 * 
 * @author Maria Vasquez
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/pe/linio/www/features/AddProduct.feature",
        glue = "pe.linio.www.stepsdefinitions",
        tags = "@TestCase1",
        snippets = SnippetType.CAMELCASE
)

public class AddProductRunner {
        
}
