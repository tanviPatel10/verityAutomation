package pageobjects.google;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ResultsPage {
    public ElementsCollection getResults() {
        return $$("a[href^='https://'] > div > cite");

    }
    public ElementsCollection getLinks() {
        return $$x("//*[@id='rso']//h3[(contains(text(),'Software'))]");
    }

    public void clickResult(int index) {
        getResults().get(index).click();
    }

    public void clickResult(String searchText) {
        getResults().find(text(searchText)).click();
    }

}
