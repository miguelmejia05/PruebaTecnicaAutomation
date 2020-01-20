package pe.promart.stepdefinitions;
import org.openqa.selenium.WebDriver;
import static pe.promart.tasks.OpenBrowserTask.intoURL;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;



public class AddProductStepDefinitions {
	private static final String OpenBrowserTask = null;

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor miguelUser = Actor.named("miguelUser");
	
	@Given("^User searchs a product$")
	public void userSearchsAProduct() {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
		
		intoURL(hisBrowser);

	}


	@When("^User picks up a product$")
	public void userPicksUpAProduct() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^User adds product to shopping cart$")
	public void userAddsProductToShoppingCart() {
	    // Write code here that turns the phrase above into concrete actions

	}
	

	@Before
	public void setUp() {
		miguelUser.can(BrowseTheWeb.with(hisBrowser));
	}
	
}
