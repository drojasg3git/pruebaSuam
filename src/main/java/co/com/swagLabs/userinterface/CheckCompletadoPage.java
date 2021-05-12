package co.com.swagLabs.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckCompletadoPage {

    public static final Target LABEL_CHECKOUT_COMPLETADO = Target.the("Label que indica compra completada")
            .located(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETADO!']"));

}
