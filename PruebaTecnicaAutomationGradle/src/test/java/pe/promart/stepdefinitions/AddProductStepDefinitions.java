package pe.promart.stepdefinitions;
import org.openqa.selenium.WebDriver;
import static pe.promart.tasks.OpenBrowserTask.intoURL;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.promart.tasks.AddProductTask;
import pe.promart.tasks.CheckCartTask;
import pe.promart.tasks.SearchProductTask;



public class AddProductStepDefinitions {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor miguelUser = Actor.named("miguelUser");
	
	@Given("^User searchs a product$")
	public void userSearchsAProduct() {
		miguelUser.attemptsTo(intoURL(hisBrowser));
	}


	@When("^User picks up a product$")
	public void userPicksUpAProduct(DataTable args1) {
		List<List<String>> data = args1.raw();
		for (int i=1; i< data.size(); i++) {
			miguelUser.attemptsTo(SearchProductTask.setProduct(hisBrowser, data.get(i).get(0).trim()));
			miguelUser.attemptsTo(AddProductTask.checkProduct(hisBrowser));
		}
	}

	@Then("^User adds product to shopping cart$")
	public void userAddsProductToShoppingCart() {
		miguelUser.attemptsTo(CheckCartTask.checkCart(hisBrowser));
	}
	

	@Before
	public void setUp() {
		miguelUser.can(BrowseTheWeb.with(hisBrowser));
	}
	
}
