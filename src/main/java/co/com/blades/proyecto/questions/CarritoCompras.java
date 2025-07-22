package co.com.blades.proyecto.questions;

import co.com.blades.proyecto.userinterface.CarritoProd;
import co.com.blades.proyecto.userinterface.HomeValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CarritoCompras implements Question<Boolean> {
    private String valCarrito;

    public CarritoCompras(String valCarrito) {
        this.valCarrito = valCarrito;
    }

    public static CarritoCompras toThe(String valCarrito) {
        return new CarritoCompras(valCarrito);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String carritoname = actor.asksFor(Text.of(HomeValidacion.CARRITO_LABEL));
        String carritobolsa = actor.asksFor(Text.of(CarritoProd.BOLSA_LABEL));
        String carritoluz = actor.asksFor(Text.of(CarritoProd.LUZ_LABEL));

        if (valCarrito.equals(carritoname))
        {result = true;}
        else {result = false;}
        return result;
    }
}
