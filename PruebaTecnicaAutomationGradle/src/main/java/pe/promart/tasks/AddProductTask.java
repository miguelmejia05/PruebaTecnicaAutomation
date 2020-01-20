package pe.promart.tasks;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static pe.promart.userinterfaces.ProductPage.LBL_PRODUCT;
import static pe.promart.userinterfaces.ProductPage.BTN_CART;

public class AddProductTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(WaitUntil.the(LBL_PRODUCT, isVisible()), WaitUntil.the(BTN_CART, isVisible()), Click.on(BTN_CART));
	}
	
	public static AddProductTask checkProduct(WebDriver hisBrowser) {
		return instrumented(AddProductTask.class, hisBrowser);
	}

}
