package co.com.swagLabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AbrirAplicacion implements Task {

    public static AbrirAplicacion abrirApp(){
        return Tasks.instrumented(AbrirAplicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
