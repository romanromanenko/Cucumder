package steps;
import io.cucumber.java.en.Then;
import pages.Metods;

public class BasePageDef {

    Metods metods = new Metods();

    @Then("Click login button")
    public void clickLoginButton() {
        metods.login();
    }
}
