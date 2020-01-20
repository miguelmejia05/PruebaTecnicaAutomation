package pe.promart.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IndexPage extends PageObject{
	
	public static final Target TXT_SEARCH = Target.the("TXT_SEARCH").located(By.id("i-search"));
	public static final Target LBL_PRODUCT = Target.the("LBL_PRODUCT").located(By.xpath("/html/body/header/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/a[2]/div/h3"));
	public static final Target BTN_CART = Target.the("BTN_CART").located(By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[2]/div/div[7]/div/button"));
	public static final Target BTN_CHECK_CART = Target.the("BTN_CHECK_CART").located(By.xpath("/html/body/div[9]/div/div/div[2]/a[2]"));


}
