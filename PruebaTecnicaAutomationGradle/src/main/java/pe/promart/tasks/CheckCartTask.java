package pe.promart.tasks;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pe.promart.userinterfaces.ProductPage.BTN_CHECK_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CheckCartTask implements Task{
	private WebDriver hisBrowser;
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(WaitUntil.the(BTN_CHECK_CART, isVisible()), Click.on(BTN_CHECK_CART));
	}
	public static CheckCartTask checkCart(WebDriver hisBrowser) {
		return instrumented(CheckCartTask.class, hisBrowser);
	}
}
