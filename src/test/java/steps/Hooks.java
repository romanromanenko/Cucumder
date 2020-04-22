package steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void start(){
        open("http://automationpractice.com/index.php");
    }

    @After
    public void finish()
    {
        close();
    }
}
