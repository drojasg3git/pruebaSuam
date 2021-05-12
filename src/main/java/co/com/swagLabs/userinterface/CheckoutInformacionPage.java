package co.com.swagLabs.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInformacionPage {

    public static final Target TEXTO_NOMBRE = Target.the("Texto para ingresar el nombre del cliente")
            .located(MobileBy.AccessibilityId("test-Nombre"));
    public static final Target TEXTO_APELLIDO = Target.the("Texto para ingresar el apellido del cliente")
            .located(MobileBy.AccessibilityId("test-Apellido"));
    public static final Target TEXTO_CODIGO_POSTAL = Target.the("Texto para ingresar el codigo postal del cliente")
            .located(MobileBy.AccessibilityId("test-Código postal"));
    public static final Target BOTON_CONTINUAR = Target.the("Bot\u00F3n para continuar la compra")
            .located(MobileBy.AccessibilityId("test-CONTINUAR"));
}
