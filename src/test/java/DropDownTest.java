import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {
    @Test
    public void dropDownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDownList = driver.findElement(By.id("dropdown"));
        WebElement el1 = dropDownList.findElement(By.xpath("//*[@id=\"dropdown\"]/option[1]"));
        el1.click();
        if (el1.isSelected()) {
            System.out.println("This element 1 is selected. Return: " + el1.isSelected());
        } else {
            System.out.println("This element 1 is not selected. Return: " + el1.isSelected());
        }

        WebElement el2 = dropDownList.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
        el2.click();
        if (el1.isSelected()) {
            System.out.println("This element 2 is selected. Return: " + el2.isSelected());
        } else {
            System.out.println("This element 2 is not selected. Return: " + el2.isSelected());
        }

    }

}
