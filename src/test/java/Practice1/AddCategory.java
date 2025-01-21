package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddCategory {
    WebDriver driver;

    @BeforeMethod
    public void createDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    }


    @Test
    public void testAddCategory() {
        driver.get("https://cms.anhtester.com/login");
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Category']")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Add New category']")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gio qua Tet 2");
        sleep(1);
        driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle btn-light'])[2]")).click();
        sleep(1);
        driver.findElement(By.xpath("//a[@id='bs-select-2-0']")).click();
        sleep(1);
        driver.findElement(By.xpath("(//div[normalize-space()='Browse'])[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@data-value='2755']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
        sleep(3);
        driver.findElement(By.xpath("(//div[normalize-space()='Browse'])[3]")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@data-value='2755']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
        sleep(3);
        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-light bs-placeholder']")).click();
        sleep(1);
        driver.findElement(By.xpath("//a[@id='bs-select-3-1']")).click();
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        sleep(1);

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Gio qua Tet 2");
        sleep(1);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
        sleep(2);
        System.out.println(driver.findElement(By.xpath("(//td[@style='display: table-cell;'])[2]")).getText());
        sleep(1);
    }


    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
    public void sleep(double second){
        try {
            Thread.sleep((long) (1000*second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
