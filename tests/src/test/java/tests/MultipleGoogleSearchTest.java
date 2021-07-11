package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pageobjects.google.ResultsPage;
import pageobjects.google.SearchPage;
import util.AllureListenerExtension;

import java.util.logging.Logger;


@ExtendWith({TextReportExtension.class, AllureListenerExtension.class})
public class MultipleGoogleSearchTest {

    private static final Logger LOG = Logger.getLogger(MultipleGoogleSearchTest.class.getName());


    @Test
    public void multipleGoogleSearchAndVerificationTest() {
        SearchPage searchPage = new SearchPage();

        //search for text
        searchPage.open();
        searchPage.search("Software");

        //verify first link
        ResultsPage resultsPage = new ResultsPage();
        resultsPage.getResults().first().shouldHave(Condition.text("Wikipedia"));

        //search for another text
        resultsPage.searchAgain("Testing");
        for (int i = 0; i < resultsPage.getResults().size(); i++) {
            if (resultsPage.getResults().get(i).getText().contains("health.govt.nz")) {
                LOG.info("Index of the health.govt.nz is: " + i);
                break;
            }
        }
    }
}