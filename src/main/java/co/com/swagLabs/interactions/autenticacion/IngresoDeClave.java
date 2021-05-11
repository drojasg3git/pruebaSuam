package co.com.swagLabs.interactions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.LoginPage.TEXTO_CLAVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresoDeClave implements Interaction {

    private String clave;

    public IngresoDeClave(String clave){
        this.clave = clave;
    }

    public static Performable delCliente(String clave) {
        return instrumented(IngresoDeClave.class, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TEXTO_CLAVE, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(clave).into(TEXTO_CLAVE)
        );
    }
}
