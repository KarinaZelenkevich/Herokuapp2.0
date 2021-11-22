import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class inputDifferentValuesTest extends BaseTest {
    @Test
    public void inputDifferentValues() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.click();
        input.sendKeys("1124565");
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_DOWN);
        input.click();

    }
}
