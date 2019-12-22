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
        assertEquals("https://www.instagram.com/", driver.getCurrentUrl());
        assertEquals("I'm on Istagram", "Instagram", driver.findElement(By.tagName("h1")).getText());
        assertEquals( "Instagram", driver.findElement(By.xpath("//h1")).getText());
        assertEquals( "Instagram", driver.findElement(By.xpath("//h1[.='Instagram']")).getText());

        driver.findElement(name("emailOrPhone")).sendKeys("test@example.com");
        WebElement emailInput=driver.findElement(By.name("emailOrPhone"));
        System.out.println("gettext: " + emailInput.getText());
        System.out.println("getAttribute: " + emailInput.getAttribute("value"));
        System.out.println("getAttributeAriaLabel: " + emailInput.getAttribute("aria-label"));
        assertEquals("test@example.com", emailInput.getAttribute("value"));

        driver.findElement(name("fullName")).sendKeys("someFullNme");
        assertEquals("someFullNme", driver.findElement(By.name("fullName")).getAttribute("value"));

        driver.findElement(name("username")).sendKeys("userName");
        assertEquals("userName", driver.findElement(By.name("username")).getAttribute("value"));

        driver.findElement(name("password")).sendKeys("P@ssw0rd");
        assertEquals("P@ssw0rd", driver.findElement(By.name("password")).getAttribute("value"));

        driver.findElement(xpath("//button[.='Sign up']")).click();
        assertEquals("Error message come up", "This username isn't available. Please try another.", driver.findElement(By.id ("ssfErrorAlert")).getText());

//        Implementation goes here.
    }
}
