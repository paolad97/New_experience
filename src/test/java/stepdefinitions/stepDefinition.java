package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Cmprar;
import tasks.OpenUp;
import tasks.PaginaPrincipal;
import tasks.Seleccionar;

public class stepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^me encuentro en la pagina principal$")
    public void meEncuentroEnLaPaginaPrincipal() {
        OnStage.theActorCalled("Paola").wasAbleTo(OpenUp.thePage());
    }


    @Given("^selecciono la seccion \"([^\"]*)\"$")
    public void seleccionoLaSeccion(String seccion) {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaPrincipal.Producto(seccion));
    }

    @When("^selecciono el \"([^\"]*)\"$")
    public void seleccionoEl(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(Cmprar.Producto((producto)));
    }

    @When("^click en el boton \"([^\"]*)\"$")
    public void clickEnElBoton(String btn) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.Btn(btn));
    }

    @Then("^visualizo la pagina de resumen de la compra \"([^\"]*)\"$")
    public void visualizoLaPaginaDeResumenDeLaCompra(String arg1) {
    }

}
