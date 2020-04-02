package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class Metods {

        public void login (String text){
            $(By.xpath("//a[@class  = '"+text+"']")).click();
        }
}
