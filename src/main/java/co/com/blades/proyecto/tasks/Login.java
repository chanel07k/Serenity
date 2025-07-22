package co.com.blades.proyecto.tasks;

import co.com.blades.proyecto.userinterface.LoginSaucedo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login CorrectoEnSaucedo() {
        return Tasks.instrumented(Login.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(LoginSaucedo.USER_TXT),
                Enter.theValue("secret_sauce").into(LoginSaucedo.PASSWORD_TXT),
                Click.on(LoginSaucedo.LOGIN_BTN)

        );
    }

}
