package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class Metods {

    private SelenideElement loginButton = $(By.className("login"));

    public void login (){
        loginButton.click();
    }
}
