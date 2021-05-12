package co.com.swagLabs.interactions.compraArticulo;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarYHacerClickAlTexto implements Interaction {
    private String articulo;
    private final String locator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"%s\").instance(0))";

    public BuscarYHacerClickAlTexto (String articulo){
        this.articulo = articulo;
    }

    public static Performable delCliente(String articulo) {
        return instrumented(BuscarYHacerClickAlTexto.class, articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MobileBy.AndroidUIAutomator(String.format(locator, articulo)))
        );
    }
}
