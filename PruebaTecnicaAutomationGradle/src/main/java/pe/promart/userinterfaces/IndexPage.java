package pe.promart.userinterfaces;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IndexPage extends PageObject{
	
	public static final Target TXT_SEARCH = Target.the("TXT_SEARCH").located(By.id("i-search"));
	public static final Target LBL_PRODUCT = Target.the("LBL_PRODUCT").located(By.xpath("/html/body/header/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/a[2]/div/h3"));

}
