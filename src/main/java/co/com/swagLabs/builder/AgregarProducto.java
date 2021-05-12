package co.com.swagLabs.builder;

import co.com.swagLabs.tasks.CompraArticulo;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class AgregarProducto {

    private String articulo;

    public Performable conElNombre(String articulo){
        this.articulo = articulo;
        return Tasks.instrumented(CompraArticulo.class, articulo);
    }
}
