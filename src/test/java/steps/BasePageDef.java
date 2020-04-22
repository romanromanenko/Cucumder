package steps;
import io.cucumber.java.en.Then;
import pages.Metods;

public class BasePageDef {

    Metods metods = new Metods();

    @Then("Click login button")
    public void clickLoginButton() { metods.openLoginPage(); }

    @Then("Input information about new user and create him")
    public void inputInformationAboutNewUserAndCreateHim() { metods.createNewUser(); }

    @Then("Open start page")
    public void openStartPage() { metods.openStartPage(); }

    @Then("Login user")
    public void loginUser() { metods.login(); }

    @Then("Open information about item")
    public void openInformationAboutItem() { metods.checkInformationAboutItem(); }

    @Then("Add item to cart")
    public void addItemToCart() { metods.addItemToCart(); }

    @Then("Check cart")
    public void checkCart() { metods.displayItemInCart(); }

    @Then("Buy item by check")
    public void buyItemByCheck() { metods.buyItemByCheck(); }
}
