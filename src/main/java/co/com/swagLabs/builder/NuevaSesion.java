package co.com.swagLabs.builder;

import co.com.swagLabs.tasks.IniciarSesion;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class NuevaSesion {

    private String usuario;
    private String clave;

    public NuevaSesion conElUsuario(String usuario){
        this.usuario = usuario;
        return this;
    }

    public Performable conLaClave(String clave){
        this.clave = clave;
        return Tasks.instrumented(IniciarSesion.class, usuario, clave);
    }


}
