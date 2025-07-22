package co.com.blades.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoProd extends PageObject {
    public static Target BOLSA_LABEL = Target.the("Extraer la validacion del home")
            .located(By.xpath("//*[@id='item_4_title_link']/div"));
    public static Target LUZ_LABEL = Target.the("Extraer la validacion del home")
            .located(By.xpath("//*[@id='item_0_title_link']/div"));
    public static Target REMOVE_BTN = Target.the("REMOVER LUZ")
            .located(By.id("remove-sauce-labs-bike-light"));

}
