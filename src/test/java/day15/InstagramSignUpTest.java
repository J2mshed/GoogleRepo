package day15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.openqa.selenium.By.*;

public class InstagramSignUpTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeInstagramSignUpTest() throws InterruptedException {
        driver.get("https://www.instagram.com/");
        assertEquals("I'm on Istagram", "Instagram", driver.findElement(By.tagName("h1")).getText());
        driver.findElement(name("emailOrPhone")).sendKeys("test@example.com");
        driver.findElement(name("fullName")).sendKeys("someFullNme");
        driver.findElement(name("username")).sendKeys("userName");
        driver.findElement(name("password")).sendKeys("P@ssw0rd");
        driver.findElement(xpath("//button[.='Sign up']")).click();
        assertEquals("Error message come up", "This username isn't available. Please try another.", driver.findElement(By.xpath ("//p[@id='ssfErrorAlert']")).getText());

//        Implementation goes here.
    }
}
