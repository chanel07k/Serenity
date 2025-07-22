package co.com.blades.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeValidacion extends PageObject {

    public static  Target NOMBRE_HOME = Target.the("Extraer la validacion del home")
            .located(By.xpath("//*[@id='header_container']/div[2]/span"));
    public static Target BOLSA_BTN = Target.the("BOTON DE PROD BOLSA")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static Target LUZBICI_BTN = Target.the("BOTON DE PROD LUZ BICI")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static Target CARRITO_BTN = Target.the("BOTON DE CARRITO")
            .located(By.id("shopping_cart_container"));
    public static Target CARRITO_LABEL = Target.the("BOTON DE CARRITO")
            .located(By.xpath("//*[@id='header_container']/div[2]/span"));
    public static Target FILTRO_BTN = Target.the("BOTON PARA FILTRO")
            .located(By.xpath("//*[@id='header_container']/div[2]/div/span/select"));
    public static Target PRECIO_MENOR = Target.the("FILTRO PARA PRECIO")
            .located(By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[3]"));
    public static Target PRODUCTO_DESC = Target.the("FILTRO PARA PRODUCTO")
            .located(By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[2]"));
}


