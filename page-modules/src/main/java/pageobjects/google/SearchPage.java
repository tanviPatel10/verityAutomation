package pageobjects.google;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    @Step("Go to google.com/ncr")
    public void open() {
        Selenide.open("http://www.google.com/ncr");
    }

    public SelenideElement getSearchField() {
        return $("input[title='Search']");
    }

    public SelenideElement getSearchButton() {
        return $("input[value='Google Search']");
    }

    @Step("Enter search as {query} and Click search button ")
    public void search(final String query) {
        SelenideElement inputBox = getSearchField();
        inputBox.setValue(query);
        SelenideElement searchButton = getSearchButton();
        searchButton.click();
    }
}
