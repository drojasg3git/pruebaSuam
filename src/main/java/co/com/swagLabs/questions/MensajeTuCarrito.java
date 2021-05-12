package co.com.swagLabs.questions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.swagLabs.userinterface.TuCarritoPage.LABEL_PRODUCTO_AGREGADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class MensajeTuCarrito implements Question<String> {

    private String articulo;

    public MensajeTuCarrito(String articulo){
        this.articulo = articulo;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(MobileBy.xpath(String.format(LABEL_PRODUCTO_AGREGADO, articulo)), isPresent()).forNoMoreThan(10).seconds()
        );
        return Text.of(MobileBy.xpath(String.format(LABEL_PRODUCTO_AGREGADO, articulo))).viewedBy(actor).asString();
    }

    public static MensajeTuCarrito deProducto(String articulo) {
        return new MensajeTuCarrito(articulo);
    }
}
