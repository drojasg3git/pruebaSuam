package co.com.swagLabs.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TEXTO_USUARIO = Target.the("Texto para ingresar el usuario")
            .located(MobileBy.AccessibilityId("test-Usuario"));
    public static final Target TEXTO_CLAVE = Target.the("Texto para ingresar la clave")
            .located(MobileBy.AccessibilityId("test-Contraseña"));
    public static final Target BOTON_LOGIN = Target.the("Bot\u00F3n para ingresar a la aplicacion")
            .located(MobileBy.AccessibilityId("test-LOGIN"));
}
