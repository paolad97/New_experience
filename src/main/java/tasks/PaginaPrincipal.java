package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.MainPage;

public class PaginaPrincipal implements Task {
    public static PaginaPrincipal Producto(String seccion) {
        return Tasks.instrumented(PaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainPage.seccion));
    }
}
