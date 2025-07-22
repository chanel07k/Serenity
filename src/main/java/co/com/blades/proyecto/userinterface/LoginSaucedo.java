package co.com.blades.proyecto.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSaucedo extends PageObject {
    public static final Target USER_TXT = Target.the("TXT DE USUARIO")
            .located(By.id("user-name"));
    public static final Target PASSWORD_TXT = Target.the("TXT DE CONTRASENA")
            .located(By.id("password"));
    public static final Target LOGIN_BTN = Target.the("BOTON PARA LOGIN")
            .located(By.id("login-button"));
    public static final Target MENU_BTN = Target.the("BOTON PARA ABRIR MENU")
            .located(By.id("react-burger-menu-btn"));
    public static final Target LOGOUT_BTN = Target.the("BOTON PARA LOGOUT")
            .located(By.id("logout_sidebar_link"));

}