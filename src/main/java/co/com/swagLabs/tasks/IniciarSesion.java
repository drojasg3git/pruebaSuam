package co.com.swagLabs.tasks;

import co.com.swagLabs.builder.NuevaSesion;
import co.com.swagLabs.interactions.autenticacion.IngresoDeClave;
import co.com.swagLabs.interactions.autenticacion.IngresoDeUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.swagLabs.userinterface.LoginPage.BOTON_LOGIN;

public class IniciarSesion implements Task {

    private String usuario;
    private String clave;

    public IniciarSesion(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    public static NuevaSesion ingresarALaAplicacion() {
        return new NuevaSesion();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresoDeUsuario.delCliente(usuario),
                IngresoDeClave.delCliente(clave),
                Click.on(BOTON_LOGIN)
        );
    }
}
