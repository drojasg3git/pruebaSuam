package co.com.swagLabs.tasks;

import co.com.swagLabs.builder.AgregarProducto;
import co.com.swagLabs.interactions.compraArticulo.BuscarYHacerClickAlTexto;
import co.com.swagLabs.interactions.compraArticulo.IngresarAlCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.swagLabs.userinterface.DescripcionProductoPage.BOTON_AGREGAR_CARRITO;

public class CompraArticulo implements Task {

    private String articulo;

    public CompraArticulo(String articulo){
        this.articulo = articulo;
    }

    public static AgregarProducto agregarElProducto() {
        return new AgregarProducto();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                BuscarYHacerClickAlTexto.delCliente(articulo),
                BuscarYHacerClickAlTexto.delCliente(BOTON_AGREGAR_CARRITO),
                IngresarAlCarrito.delCliente()
        );
    }
}
