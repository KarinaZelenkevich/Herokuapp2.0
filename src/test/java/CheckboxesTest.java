import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class CheckboxesTest extends BaseTest {
    @Test
    public void checkedUncheckedBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        if (checkBox1.isEnabled()) {
            System.out.println("Checkbox 1 is enabled. Return: " + checkBox1.isEnabled());
        } else {
            checkBox1.click();
        }

        if (checkBox1.isSelected()) {
            System.out.println("Checkbox 1 is selected. Return: " + checkBox1.isSelected());
        } else {
            System.out.println("Checkbox 1 is not selected. Return: " + checkBox1.isSelected());
        }

        WebElement checkBox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        if (checkBox2.isEnabled()) {
            System.out.println("Checkbox 2 is enabled. Return: " + checkBox2.isEnabled());
        } else {
            checkBox2.click();
        }
        if (checkBox2.isSelected()) {
            System.out.println("Checkbox 2 is selected. Return: " + checkBox2.isSelected());
        } else {
            System.out.println("Checkbox 2 is not selected. Return: " + checkBox2.isSelected());
        }
    }
}
