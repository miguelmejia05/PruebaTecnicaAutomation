package pe.promart.userinterfaces;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject{
	public static final Target LBL_PRODUCT = Target.the("LBL_PRODUCT").located(By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[1]/h2/div"));
	public static final Target BTN_CART = Target.the("BTN_CART").located(By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[2]/div/div[7]/div/button"));
	public static final Target BTN_CHECK_CART = Target.the("BTN_CHECK_CART").located(By.xpath("/html/body/div[9]/div/div/div[2]/a[2]"));
}
