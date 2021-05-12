package co.com.swagLabs.interactions.compraArticulo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.CheckoutInformacionPage.TEXTO_CODIGO_POSTAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresoDeCodigoPostal implements Interaction {

    private String codigoPostal;

    public IngresoDeCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }

    public static Performable delCliente(String codigoPostal) {
        return instrumented(IngresoDeCodigoPostal.class, codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TEXTO_CODIGO_POSTAL, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(codigoPostal).into(TEXTO_CODIGO_POSTAL)
        );
    }
}
