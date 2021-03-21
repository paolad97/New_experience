package userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject{
    public static final Target camiseta = Target.the("Producto camiseta").located(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
}
