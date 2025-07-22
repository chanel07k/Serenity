package co.com.blades.proyecto.tasks;

import co.com.blades.proyecto.userinterface.UrlSaucedo;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Buscar implements Task { //Se usa para importar libreria serenity SC
    private UrlSaucedo  urlSaucedo;
    public static Buscar PaginaSaucedo() {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) { //Usar para ingresar acciones, clicks y etc

        actor.attemptsTo(Open.browserOn(urlSaucedo));
    }

}