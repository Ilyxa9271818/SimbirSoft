package tests;

import helpers.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CalculatorPage;

import java.time.Duration;

public class CalculatorTest {

    public CalculatorPage calculatorPage;
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webDriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        calculatorPage = new CalculatorPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void calculatorTestFirst() {
        driver.get(ConfProperties.getProperty("googlePage"));
        calculatorPage.search("Калькулятор");
        calculatorPage.firstExpressionResult();

    }

    @Test
    public void calculatorTestSecond() {
        driver.get(ConfProperties.getProperty("googlePage"));
        calculatorPage.search("Калькулятор");
        calculatorPage.secondExpressionResult();
    }

    @Test
    public void calculatorTestThird() {
        driver.get(ConfProperties.getProperty("googlePage"));
        calculatorPage.search("Калькулятор");
        calculatorPage.thirdExpressionResult();
    }


    @AfterClass
    public void driverQuit() {
        driver.quit();
    }
}
