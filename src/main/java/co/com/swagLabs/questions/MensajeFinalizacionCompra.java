package co.com.swagLabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.CheckCompletadoPage.LABEL_CHECKOUT_COMPLETADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class MensajeFinalizacionCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_CHECKOUT_COMPLETADO, isPresent()).forNoMoreThan(10).seconds()
        );
        return Text.of(LABEL_CHECKOUT_COMPLETADO).viewedBy(actor).asString();
    }

    public static MensajeFinalizacionCompra completado() {
        return new MensajeFinalizacionCompra();
    }
}
