package steps;
import io.cucumber.java.en.Then;
import pages.Metods;

public class BasePageDef {

    Metods metods = new Metods();

    @Then("Click login button")
    public void clickLoginButton() {
        metods.openLoginPage();
    }

    @Then("Input information about new user and create him")
    public void inputInformationAboutNewUserAndCreateHim() {
        metods.createNewUser();
    }
}
