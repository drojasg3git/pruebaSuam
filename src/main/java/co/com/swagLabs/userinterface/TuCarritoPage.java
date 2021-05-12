package co.com.swagLabs.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class TuCarritoPage {

    public static final String LABEL_PRODUCTO_AGREGADO = "//android.widget.TextView[@text=\"%s\"]";
    public static final Target BOTON_CHECKOUT = Target.the("Bot\u00F3n para avanzar al checkout")
            .located(MobileBy.AccessibilityId("test-CHECKOUT"));

}
