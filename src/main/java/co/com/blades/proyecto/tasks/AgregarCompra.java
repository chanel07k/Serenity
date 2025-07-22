package co.com.blades.proyecto.tasks;

import co.com.blades.proyecto.userinterface.HomeValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarCompra implements Task {

    public static AgregarCompra Productos() {
        return Tasks.instrumented(AgregarCompra.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeValidacion.BOLSA_BTN),
                Click.on(HomeValidacion.LUZBICI_BTN),
                Click.on(HomeValidacion.CARRITO_BTN));

    }
}
