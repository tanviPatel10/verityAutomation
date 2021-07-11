package tests;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pageobjects.google.ResultsPage;
import pageobjects.google.SearchPage;
import util.AllureListenerExtension;

import static com.codeborne.selenide.CollectionCondition.size;

@ExtendWith({TextReportExtension.class, AllureListenerExtension.class})
public class MyTest {

    @Test
    public void test() {
        SearchPage searchPage = new SearchPage();
        searchPage.open();
        searchPage.search("Hello World");

        ResultsPage resultsPage = new ResultsPage();
        resultsPage.getResults().shouldHave(size(6));

        resultsPage.clickResult("facebook");
    }
}