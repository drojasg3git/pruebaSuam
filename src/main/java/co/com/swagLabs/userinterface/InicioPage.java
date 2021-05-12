package co.com.swagLabs.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class InicioPage {

    public static final Target LABEL_PRODUCTOS = Target.the("Label que indica productos")
            .located(MobileBy.xpath("//android.widget.TextView[@text='PRODUCTOS']"));

}
