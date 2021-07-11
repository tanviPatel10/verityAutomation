package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.LoggerFactory;
import pageobjects.google.ResultsPage;
import pageobjects.google.SearchPage;
import util.AllureListenerExtension;

import java.util.logging.Logger;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;


@ExtendWith({TextReportExtension.class, AllureListenerExtension.class})
public class MyTest {

    private static final Logger LOG = Logger.getLogger(MyTest.class.getName());


    @Test
    public void test() {
        SearchPage searchPage = new SearchPage();
        searchPage.open();
        searchPage.search("Software");

        ResultsPage resultsPage = new ResultsPage();
//        resultsPage.clickResult(0);

        resultsPage.getResults().shouldHave(size(17));

        LOG.info(resultsPage.getLinks().toString());

//        resultsPage.getLinks("Software");

//        resultsPage.clickResult(0);


//        LOG.info("************************************");
//        LOG.info("************************************");



        resultsPage.getResults().first().shouldHave(Condition.text("Software"));

        //working
//        resultsPage.clickResult("wikipedia");
    }
}