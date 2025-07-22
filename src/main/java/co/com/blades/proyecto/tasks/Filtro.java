package co.com.blades.proyecto.tasks;

import co.com.blades.proyecto.userinterface.HomeValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Filtro implements Task {
    public static Filtro Precio() {
        return Tasks.instrumented(Filtro.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomeValidacion.FILTRO_BTN),
                WaitUntil.the(HomeValidacion.PRECIO_MENOR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeValidacion.PRECIO_MENOR).afterWaitingUntilPresent(),
                Click.on(HomeValidacion.PRODUCTO_DESC).afterWaitingUntilEnabled(),
                WaitUntil.the(HomeValidacion.PRODUCTO_DESC, isVisible()).forNoMoreThan(10).seconds());

    }
}
