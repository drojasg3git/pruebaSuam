package co.com.swagLabs.builder;

import co.com.swagLabs.tasks.FinalizacionCompra;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class FinalizarCompra {

    private String nombre;
    private String apellido;
    private String codigoPostal;

    public FinalizarCompra conElNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public FinalizarCompra conElApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public Performable conElCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
        return Tasks.instrumented(FinalizacionCompra.class, nombre, apellido, codigoPostal);
    }
}
