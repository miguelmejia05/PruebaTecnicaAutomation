package pe.promart.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pe.promart.userinterfaces.IndexPage.LBL_PRODUCT;
import static pe.promart.userinterfaces.IndexPage.TXT_SEARCH;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchProductTask implements Task {
	
	private WebDriver hisBrowser;
	private String strProduct;

	public SearchProductTask(WebDriver hisBrowser, String strProduct) {
		super();
		this.hisBrowser = hisBrowser;
		this.strProduct = strProduct;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(WaitUntil.the(TXT_SEARCH, isVisible()), Enter.theValue(strProduct).into(TXT_SEARCH),
				WaitUntil.the(LBL_PRODUCT, isVisible()), Click.on(LBL_PRODUCT));
	}

	public static SearchProductTask setProduct(WebDriver hisBrowser, String strProduct) {
		return instrumented(SearchProductTask.class, hisBrowser, strProduct);
	}
}
