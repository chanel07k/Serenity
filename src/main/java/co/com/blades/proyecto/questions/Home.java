package co.com.blades.proyecto.questions;

import co.com.blades.proyecto.userinterface.HomeValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Home implements Question<Boolean> {
    private String valtitulo;

    public Home(String valtitulo) {
        this.valtitulo = valtitulo;
    }

    public static Home toThe(String valtitulo) {
        return new Home(valtitulo);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String nombrehome = actor.asksFor(Text.of(HomeValidacion.NOMBRE_HOME));

        if (valtitulo.equals(nombrehome))
        {
           result = true;
        }
        else {
            result = false;
        }

        return result;
    }


}
