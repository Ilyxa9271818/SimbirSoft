package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//input [@title = 'Поиск']")
    WebElement searchField;

    @FindBy (xpath = "//input [@value = 'Поиск в Google']")
    WebElement searchButton;

    @FindBy (xpath = "//div [text() = '(']")
    WebElement clickOpenBracket;

    @FindBy (xpath = "//div [text() = ')']")
    WebElement clickClosingBracket;

    @FindBy (xpath = "//div [text() = '1']")
    WebElement click1;

    @FindBy (xpath = "//div [text() = '2']")
    WebElement click2;

    @FindBy (xpath = "//div [text() = '3']")
    WebElement click3;

    @FindBy (xpath = "//div [text() = '4']")
    WebElement click4;

    @FindBy (xpath = "//div [text() = '5']")
    WebElement click5;

    @FindBy (xpath = "//div [text() = '6']")
    WebElement click6;

    @FindBy (xpath = "//div [text() = '0']")
    WebElement click0;

    @FindBy (xpath = "//div [text() = 'sin']")
    WebElement clickSin;

    @FindBy (xpath = "//div [text() = '+']")
    WebElement plus;

    @FindBy (xpath = "//div [text() = '−']")
    WebElement minus;

    @FindBy (xpath = "//div [text() = '×']")
    WebElement multiplication;

    @FindBy (xpath = "//div [text() = '÷']")
    WebElement division;

    @FindBy (xpath = "//div [text() = '=']")
    WebElement equals;

    public void search(String Search) {
        searchField.sendKeys(Search);
        searchButton.click();
    }

    public void firstExpressionResult() {
        clickOpenBracket.click();
        click1.click();
        plus.click();
        click2.click();
        clickClosingBracket.click();
        multiplication.click();
        click3.click();
        minus.click();
        click4.click();
        click0.click();
        division.click();
        click5.click();
        equals.click();

    }

    public void secondExpressionResult() {
        click6.click();
        division.click();
        click0.click();
        equals.click();
    }

    public void thirdExpressionResult() {
        clickSin.click();
        equals.click();
    }

}
