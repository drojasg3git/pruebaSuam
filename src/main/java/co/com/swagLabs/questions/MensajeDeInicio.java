package co.com.swagLabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.InicioPage.LABEL_PRODUCTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class MensajeDeInicio implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_PRODUCTOS, isPresent()).forNoMoreThan(10).seconds()
        );
        return Text.of(LABEL_PRODUCTOS).viewedBy(actor).asString();
    }

    public static MensajeDeInicio deSaludo() {
        return new MensajeDeInicio();
    }
}
