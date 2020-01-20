package pe.promart.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features/add_product.feature"},
		glue ="pe.promart.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class AddProductRunner {

}
