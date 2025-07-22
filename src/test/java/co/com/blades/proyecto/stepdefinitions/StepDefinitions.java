package co.com.blades.proyecto.stepdefinitions;

import co.com.blades.proyecto.questions.Home;
import co.com.blades.proyecto.tasks.Buscar;
import co.com.blades.proyecto.tasks.LogOut;
import co.com.blades.proyecto.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitions {

    @Before
    public void SetStage() {
        OnStage.setTheStage(new OnlineCast()); //Se prepara el escenario para el actor
    }

    @Dado("que el usuario navega por la pagina de inicio")
    public void queElUsuarioNavegaPorLaPaginaDeInicio() {
        OnStage.theActorCalled("Kristelle").wasAbleTo(Buscar.PaginaSaucedo());


    }

    @Cuando("ingresa las creedenciales correctas")
    public void ingresaLasCreedencialesCorrectas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.CorrectoEnSaucedo());

    }

    @Entonces("deberia ver la pagina principal con la palabra (.*)$")
    public void deberiaVerLaPaginaPrincipalConLaPalabraProducto(String valtitulo) {
        OnStage.theActorInTheSpotlight().should(seeThat(Home.toThe(valtitulo)));

    }

    @Entonces("cierro sesion")
    public void cierro_sesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogOut.CorrectoEnSaucedo());

    }
}
