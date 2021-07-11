package bla;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.open;

public class MyTest {
    private static final Logger LOG = LoggerFactory.getLogger(MyTest.class);

    @Test
    public void test() {
        open("https://www.google.com");
        LOG.info("Hello");
    }

}