package co.com.swagLabs.tasks;

import co.com.swagLabs.builder.FinalizarCompra;
import co.com.swagLabs.interactions.compraArticulo.BuscarYHacerClickAlTexto;
import co.com.swagLabs.interactions.compraArticulo.IngresoDeApellido;
import co.com.swagLabs.interactions.compraArticulo.IngresoDeCodigoPostal;
import co.com.swagLabs.interactions.compraArticulo.IngresoDeNombre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.swagLabs.userinterface.CheckoutInformacionPage.BOTON_CONTINUAR;
import static co.com.swagLabs.userinterface.CheckoutResumenPage.BOTON_TERMINAR;
import static co.com.swagLabs.userinterface.TuCarritoPage.BOTON_CHECKOUT;

public class FinalizacionCompra implements Task {

    private String nombre;
    private String apellido;
    private String codigoPostal;

    public FinalizacionCompra (String nombre, String apellido, String codigoPostal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static FinalizarCompra checkOutDeLaCompra() {
        return new FinalizarCompra();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BOTON_CHECKOUT),
                    IngresoDeNombre.delCliente(nombre),
                    IngresoDeApellido.delCliente(apellido),
                    IngresoDeCodigoPostal.delCliente(codigoPostal),
                    Click.on(BOTON_CONTINUAR),
                    BuscarYHacerClickAlTexto.delCliente(BOTON_TERMINAR)
            );
    }
}
