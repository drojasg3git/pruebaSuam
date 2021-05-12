package co.com.swagLabs.interactions.compraArticulo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.DescripcionProductoPage.BOTON_IR_AL_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresarAlCarrito implements Interaction {

    public static Performable delCliente() {
        return instrumented(IngresarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_IR_AL_CARRITO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_IR_AL_CARRITO)
        );
    }
}
