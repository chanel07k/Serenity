package co.com.blades.proyecto.stepdefinitions;

import co.com.blades.proyecto.tasks.Buscar;
import co.com.blades.proyecto.tasks.Filtro;
import co.com.blades.proyecto.tasks.LogOut;
import co.com.blades.proyecto.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class NavegacionStep {
    @Before
    public void SetStage() {
        OnStage.setTheStage(new OnlineCast()); //Se prepara el escenario para el actor
    }

    @Dado("que el usuario navega por la pagina")
    public void que_el_usuario_navega_por_la_pagina() {
        OnStage.theActorCalled("Kristelle").wasAbleTo(Buscar.PaginaSaucedo()
                , Login.CorrectoEnSaucedo());

    }
    @Cuando("valido los filtos de los precio y nombres")
    public void valido_los_filtos_de_los_precio_y_nombres() {
        OnStage.theActorInTheSpotlight().attemptsTo(Filtro.Precio());

    }
    @Entonces("Puedo cerrar la sesion")
    public void puedo_cerrar_la_sesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogOut.CorrectoEnSaucedo());

    }

}
