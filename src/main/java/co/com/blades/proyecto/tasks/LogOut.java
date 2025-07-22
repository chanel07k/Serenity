package co.com.blades.proyecto.tasks;

import co.com.blades.proyecto.userinterface.HomeValidacion;
import co.com.blades.proyecto.userinterface.LoginSaucedo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogOut implements Task {
    public static LogOut CorrectoEnSaucedo() {
        return Tasks.instrumented(LogOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginSaucedo.MENU_BTN),
                WaitUntil.the(LoginSaucedo.LOGOUT_BTN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LoginSaucedo.LOGOUT_BTN));





    }
}
