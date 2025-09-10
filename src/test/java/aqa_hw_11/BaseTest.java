package aqa_hw_11;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Base64;

import static com.codeborne.selenide.Configuration.browser;
import static io.restassured.RestAssured.given;


public class BaseTest {
    protected int testCaseId;

    @BeforeMethod
    public void initDriver() {

        browser = "firefox";
        Configuration.browserSize = "2560x1440";
        Selenide.open("https://demoqa.com/");

    }
    @AfterMethod
    public void publishTestResultsToTestRail(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            publishResult(1, testCaseId);
        } else {
            publishResult(5, testCaseId);
        }
    }

    private static final String RUN_ID = "9";
    private static final String BASE_API_URL = "https://bergamot1144tech.testrail.io/index.php?/api/v2/";
    private static final String USER_EMAIL = "bergamot.ads1@gmail.com";
    private static final String USER_PASSWORD = "Bergamot1144techdeck$";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((USER_EMAIL + ":" + USER_PASSWORD).getBytes());

    private void publishResult(int statusId, int testCaseId) {
        given().header("Authorization", "Basic " + CREDENTIALS)
                .contentType("Application/json")
                .body(new TestRailRequestDto(statusId))
                .post(BASE_API_URL + String.format("add_result_for_case/%s/%s", RUN_ID, testCaseId));
    }
}
