package demo.api.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import java.time.LocalDate;
import javax.annotation.Nonnull;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Базовый класс для тестов с настройкой основной конфигурации, общими функциями.
 */
@Log4j2
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
abstract class AbstractTest {
    private static final String ALLURE_LISTENER = "allure";
    private static final String DEFAULT_SCREEN_SIZE = "1920x1080";
    private static final String START_URL_DEFAULT = "http://85.192.34.140:8081/";


    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener(ALLURE_LISTENER, new AllureSelenide());
        Configuration.headless = true;
        Configuration.browserSize = DEFAULT_SCREEN_SIZE;
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 15000;
        Configuration.timeout = 45000;
    }

    @SneakyThrows
    @AfterAll
    static void afterAll() {
        SelenideLogger.removeListener(ALLURE_LISTENER);
    }


    /**
     * Дата, используемая по умолчанию.
     */
    @Nonnull
    LocalDate getDate() {
        return LocalDate.now().minusYears(20);
    }

}
