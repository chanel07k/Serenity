package co.com.blades.proyecto.questions;

import co.com.blades.proyecto.userinterface.CarritoProd;
import co.com.blades.proyecto.userinterface.HomeValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCompras implements Question<Boolean> {
    private String bolsa;
    private String luz;

    public ValidarCompras(String bolsa, String luz) {
        this.bolsa = bolsa;
        this.luz = luz;
    }

    public static ValidarCompras toThe(String bolsa, String luz) {
        return new ValidarCompras(bolsa,luz);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String carritobolsa = actor.asksFor(Text.of(CarritoProd.BOLSA_LABEL));
        String carritoluz = actor.asksFor(Text.of(CarritoProd.LUZ_LABEL));

        if (bolsa.equals(carritobolsa) && (luz.equals(carritoluz)))
        {result = true;}
        else {result = false;}
        return result;
    }
}