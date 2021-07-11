package pageobjects.google;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public void open() {
        Selenide.open("https://www.google.com");
    }

    public SelenideElement getSearchField() {
        return $("input[title='Search']");
    }

    public SelenideElement getSearchButton() {
        return $("input[value='Google Search']");
    }

    public void search(final String query) {
        SelenideElement inputBox = getSearchField();
        inputBox.setValue(query);
        SelenideElement searchButton = getSearchButton();
        searchButton.click();
    }
}
