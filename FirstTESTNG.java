import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTESTNG {
    WebDriver driver;
    @Test (priority = 1)
    void openbrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\patel\\IdeaProjects\\MyfirstTestNG\\src\\test\\java\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @Test (priority = 2)
    void login(){
        driver.findElement(By.className("ico-login"));
        driver.findElement(By.className("email")).sendKeys("patelviraj695@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("jssjssdosi");

    }
    @Test (priority = 3)
    void quite(){
        driver.quit();
    }
}
