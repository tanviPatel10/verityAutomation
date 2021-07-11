package pageobjects.google;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ResultsPage {
    public ElementsCollection getResults() {
        return $$x("//div[@id='rso']/div[@class='g']");
    }

    public SelenideElement getSearchField() {
        return $("input[type='text']");
    }

    @Step("Get search results with {index}")
    public void clickResult(int index) {
        getResults().get(index).click();
    }

    @Step("Get search results with {searchText}")
    public void clickResult(String searchText) {
        getResults().find(text(searchText)).click();
    }

    @Step("Search on the ResultsPage with {query}")
    public void searchAgain(final String query) {
        SelenideElement inputBox = getSearchField();
        inputBox.setValue(query).pressEnter();
    }

    public int getIndexForText(final String resultText) {
        for (int i = 0; i < getResults().size(); i++) {
            if (getResults().get(i).getText().contains("health.govt.nz")) {
                return i;
            }
        }
        return 0;
    }
}
