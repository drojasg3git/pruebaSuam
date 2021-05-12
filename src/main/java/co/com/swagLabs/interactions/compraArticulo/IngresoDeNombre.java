package co.com.swagLabs.interactions.compraArticulo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.CheckoutInformacionPage.TEXTO_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresoDeNombre implements Task {

    private String nombre;

    public IngresoDeNombre(String nombre){
        this.nombre = nombre;
    }

    public static Performable delCliente(String nombre) {
        return instrumented(IngresoDeNombre.class, nombre);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TEXTO_NOMBRE, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(nombre).into(TEXTO_NOMBRE)
        );
    }
}
