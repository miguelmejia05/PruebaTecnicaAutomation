package pe.promart.tasks;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static pe.promart.userinterfaces.IndexPage.TXT_SEARCH;
import static pe.promart.userinterfaces.IndexPage.LBL_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProductTask implements Task{
	public SearchProductTask(WebDriver hisBrowser, String strProduct) {
		super();
		this.hisBrowser = hisBrowser;
		this.strProduct = strProduct;
	}

	private WebDriver hisBrowser;
	private String strProduct;
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(strProduct).into(TXT_SEARCH), Click.on(LBL_PRODUCT));
	}

	public static SearchProductTask setProduct(WebDriver hisBrowser, String strProduct) {
		return instrumented(SearchProductTask.class, hisBrowser, strProduct);
	}
}
