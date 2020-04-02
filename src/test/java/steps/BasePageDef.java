package steps;
import io.cucumber.java.en.Then;
import pages.Metods;

public class BasePageDef {

    Metods metods = new Metods();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        metods.login(arg0);
    }
}
