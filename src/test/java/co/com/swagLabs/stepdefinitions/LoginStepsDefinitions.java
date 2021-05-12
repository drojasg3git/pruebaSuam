package co.com.swagLabs.stepdefinitions;

import co.com.swagLabs.exceptions.login.ErrorDeLogin;
import co.com.swagLabs.questions.MensajeDeInicio;
import co.com.swagLabs.tasks.AbrirAplicacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.swagLabs.exceptions.login.ErrorDeLogin.INICIO_DE_SESION_NO_EXITOSO;
import static co.com.swagLabs.tasks.IniciarSesion.ingresarALaAplicacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinitions {

    @Dado("^que (.*) quiere ingresar a la aplicacion$")
    public void queQuiereIngresarALaAplicacion(String nombre) {
        OnStage.theActorCalled(nombre).wasAbleTo(AbrirAplicacion.abrirApp());
    }


    @Cuando("^ingresa su (.*) y (.*)$")
    public void ingresaSuStandard_userYSecret_sauce(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ingresarALaAplicacion().conElUsuario(usuario).conLaClave(clave)
        );
    }

    @Entonces("^el debe ver el mensaje (.*)$")
    public void elDebeVerElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeDeInicio.deSaludo(), equalTo(mensaje))
                .orComplainWith(ErrorDeLogin.class, INICIO_DE_SESION_NO_EXITOSO)
        );
    }
}
