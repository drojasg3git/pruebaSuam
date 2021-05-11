package co.com.swagLabs.interactions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.LoginPage.TEXTO_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresoDeUsuario implements Interaction {

    private String usuario;

    public IngresoDeUsuario(String usuario){
        this.usuario = usuario;
    }

    public static Performable delCliente(String usuario) {
        return instrumented(IngresoDeUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TEXTO_USUARIO, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(usuario).into(TEXTO_USUARIO)
        );
    }
}
