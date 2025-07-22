package co.com.blades.proyecto.tasks;

import co.com.blades.proyecto.userinterface.CarritoProd;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class RemoverCarrito implements Task {
    public static RemoverCarrito Productos() {
        return Tasks.instrumented(RemoverCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoProd.REMOVE_BTN));

    }
}
