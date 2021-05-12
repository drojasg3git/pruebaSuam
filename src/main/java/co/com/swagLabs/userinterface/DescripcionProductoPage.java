package co.com.swagLabs.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class DescripcionProductoPage {

    public static final String BOTON_AGREGAR_CARRITO = "A\u00D1ADIR A CARRITO";
    public static final Target BOTON_IR_AL_CARRITO = Target.the("Bot\u00F3n para ingresar ir al carrito")
            .located(MobileBy.AccessibilityId("test-Carrito"));
}
