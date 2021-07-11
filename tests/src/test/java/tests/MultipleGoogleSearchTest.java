package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pageobjects.google.ResultsPage;
import pageobjects.google.SearchPage;
import util.AllureListenerExtension;
import java.util.logging.Logger;

@DisplayName("Google Search")
@ExtendWith({TextReportExtension.class, AllureListenerExtension.class})
public class MultipleGoogleSearchTest {
    private static final Logger LOG = Logger.getLogger(MultipleGoogleSearchTest.class.getName());

    @Test
    public void multipleGoogleSearchAndVerificationTest() {
        SearchPage searchPage = new SearchPage();

        //search for text 'Software'
        searchPage.open();
        searchPage.search("Software");

        //verify first link is wikipedia
        ResultsPage resultsPage = new ResultsPage();
        resultsPage.getResults().first().shouldHave(Condition.text("Wikipedia"));

        //search for another text 'testing' and display the index
        resultsPage.searchAgain("Testing");
        LOG.info("Index of the health.govt.nz is: " + resultsPage.getIndexForText("health.govt.nz"));
    }
}