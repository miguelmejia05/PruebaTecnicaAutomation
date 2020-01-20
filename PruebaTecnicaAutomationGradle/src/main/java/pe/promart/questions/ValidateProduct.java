package pe.promart.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateProduct implements Question<String> {

	private static Target strProduct;

	public ValidateProduct(Target target) {
		strProduct = target;
	}

	public static ValidateProduct of(Target strProduct) {
		return new ValidateProduct(strProduct);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(strProduct).viewedBy(actor).asString();
	}
}
