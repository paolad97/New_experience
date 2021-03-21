package userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends PageObject implements Ability {
    public static final Target seccion = Target.the("Seccion de los productos")
            .located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
}
