package co.com.blades.proyecto.stepdefinitions;

import co.com.blades.proyecto.questions.CarritoCompras;
import co.com.blades.proyecto.questions.Home;
import co.com.blades.proyecto.questions.ValidarCompras;
import co.com.blades.proyecto.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprarStep {
    @Before
    public void SetStage(){
        OnStage.setTheStage( new OnlineCast()); //Se prepara el escenario para el actor
    }

    @Dado("que el usuario navega por la pagina y seleciona el producto")
    public void que_el_usuario_navega_por_la_pagina_y_seleciona_el_producto() {
        OnStage.theActorCalled("Kristelle").wasAbleTo(Buscar.PaginaSaucedo()
                ,Login.CorrectoEnSaucedo());
    }
    @Cuando("hace click y valida la selecion en el carrito (.*)$")
    public void hace_click_y_valida_la_selecion_en_el_carrito_Your_Cart(String valCarrito) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarCompra.Productos());
        OnStage.theActorInTheSpotlight().should(seeThat(CarritoCompras.toThe(valCarrito)));
    }

    @Cuando("validar la compra de (.*) y (.*)$")
    public void validar_la_compra_de_Sauce_Labs_Backpack_y_Sauce_Labs_Bike_Light(String bolsa, String luz) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarCompras.toThe(bolsa,luz)));

    }
    @Entonces("deberia poder remover (.*) y validar$")
    public void deberia_poder_remover_sauce_labs_bike_light_y_validar(String Luz1) {
        OnStage.theActorInTheSpotlight().attemptsTo(RemoverCarrito.Productos(),(LogOut.CorrectoEnSaucedo()));

    }


}
