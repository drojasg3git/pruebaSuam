package co.com.swagLabs.interactions.compraArticulo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.CheckoutInformacionPage.TEXTO_APELLIDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresoDeApellido implements Interaction {

    private String apellido;

    public IngresoDeApellido(String apellido){
        this.apellido = apellido;
    }

    public static Performable delCliente(String apellido) {
        return instrumented(IngresoDeApellido.class, apellido);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TEXTO_APELLIDO, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(apellido).into(TEXTO_APELLIDO)
        );
    }
}
