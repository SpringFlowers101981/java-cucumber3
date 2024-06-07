package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static support.DriverFactory.getDriver;

public class GoogleStepDefs {
    @Given("I open {string}")
    public void iOpen(String url) {

        getDriver().get(url);
    }

    @Then("I verify page is opened")
    public void iVerifyPageIsOpened() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("q")));
    }
}
