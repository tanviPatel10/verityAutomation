package pageobjects.google;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {
    public ElementsCollection getResults() {
        return $$("a[ping^='/url'] > div > cite");
    }

    public void clickResult(int index) {
        getResults().get(index).click();
    }

    public void clickResult(String searchText) {
        getResults().find(text(searchText)).click();
    }

}
