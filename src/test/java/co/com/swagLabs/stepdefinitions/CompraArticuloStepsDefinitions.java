package co.com.swagLabs.stepdefinitions;

import co.com.swagLabs.questions.MensajeFinalizacionCompra;
import co.com.swagLabs.questions.MensajeTuCarrito;
import co.com.swagLabs.tasks.CompraArticulo;
import co.com.swagLabs.tasks.FinalizacionCompra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CompraArticuloStepsDefinitions {

    @Cuando("^añade el articulo (.*) al carrito$")
    public void compraElArticulo(String articulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompraArticulo.agregarElProducto().conElNombre(articulo)
        );
    }

    @Entonces("^verifica que agrego el producto (.*)$")
    public void verificaQueAgregoElProducto(String articulo) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeTuCarrito.deProducto(articulo), equalTo(articulo))
        );
    }

    @Entonces("^ingresa el (.*) (.*) (.*)$")
    public void ingresaEl(String nombre, String apellido, String codigoPostal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinalizacionCompra.checkOutDeLaCompra().conElNombre(nombre).conElApellido(apellido).conElCodigoPostal(codigoPostal)
        );
    }

    @Entonces("^finalizara la compra viendo el mensaje (.*)$")
    public void finalizaraLaCompraViendoElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeFinalizacionCompra.completado(), equalTo(mensaje))
        );
    }

}
