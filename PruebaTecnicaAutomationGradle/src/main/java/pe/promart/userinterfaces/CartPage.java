package pe.promart.userinterfaces;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject{
	public static final Target LBL_PRODUCT = Target.the("LBL_PRODUCT").located(By.xpath("//*[@id=\"product-name111706\"]"));
	
}
