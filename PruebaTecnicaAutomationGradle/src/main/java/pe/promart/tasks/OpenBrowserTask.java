package pe.promart.tasks;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import pe.promart.userinterfaces.IndexPage;

public class OpenBrowserTask implements Task{
	private IndexPage indexPage;
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(Open.browserOn(indexPage));
	}
	
	public static OpenBrowserTask intoURL(WebDriver hisBrowser) {
		return instrumented(OpenBrowserTask.class, hisBrowser);
	}

}
