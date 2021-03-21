package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {

    String btn;

    public Seleccionar(String btn) {
        this.btn = btn;
    }

    public static Seleccionar Btn(String btn) {
        return Tasks.instrumented(Seleccionar.class,btn);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on("//span[contains(text(),'"+btn+"')]"));
    }
}
