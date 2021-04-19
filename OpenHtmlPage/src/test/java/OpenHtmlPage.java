import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenHtmlPage {
    WebDriver driver;

    @BeforeTest

    public void preCondition() {
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe.exe");
        driver = new ChromeDriver();
        driver.get("C:\\Repository\\Task4\\PageHtml\\index.html");
    }

    @Test
    public void findTable() {
    driver.findElement(By.xpath("/html/body/table"));
    Assert.assertTrue(driver.findElement(By.xpath("/html/body/table")).isDisplayed());
    }
    @Test
    public void findFormName(){
        driver.findElement(By.xpath("/html/body/form[1]"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/form[1]")).isDisplayed());
            }
    @Test
    public void findFormLogin() {
        driver.findElement(By.xpath("/html/body/form[2]"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/form[2]")).isDisplayed());
    }
    @Test
    public void findFormCheckbox() {
        driver.findElement(By.xpath("/html/body/form[3]"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/form[3]")).isDisplayed());
    }
    @Test
    public void checkboxOn() {

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
        checkbox.click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"vehicle1\"]")).isSelected());
    }
    @Test
    public void findFormDropdown() {
        Select dropdown = new Select(driver.findElement(By.id("cars")));
        driver.findElement(By.id("cars")).click();
    dropdown.selectByVisibleText("Saab");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"cars\"]/option[2]")).isSelected());
    }
    @Test
    public void findFormButton() {
        driver.findElement(By.xpath("/html/body/button"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/button")).isDisplayed());
    }
    @Test
    public void findFormImg() {
        driver.findElement(By.xpath("/html/body/img"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/img")).isDisplayed());
    }
    @Test
    public void findFormText() {
        driver.findElement(By.xpath("/html/body/p"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/p")).getText().equalsIgnoreCase("Hello! Guys.It's true !ok ? I am very happy!"));
    }
    @Test
    public void link() {

        WebElement link = driver.findElement(By.xpath("/html/body/a"));
        link.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.youtube.com/watch?v=C142fkaLLfc"));
    }
    @AfterTest
    public void postTest() {
        //driver.quit();
    }
}