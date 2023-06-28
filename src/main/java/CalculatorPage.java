import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends AbstractObjectPage {

    @FindBy(id = "sk1")
    private WebElement inputFirstNumber;
    @FindBy(id = "sk2")
    private WebElement inputSecondNumber;
    @FindBy(xpath = "//form[@id='number']//select")
    private WebElement operationSign;
    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement clickCalculate;

    @FindBy(id = "sk1.errors")
    private WebElement warningCalculatorMessage;





    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
    public void setInputFirstNumber(Integer number){ inputFirstNumber.sendKeys(number.toString()); }
    public void setInputSecondNumber(Integer number){ inputSecondNumber.sendKeys(number.toString()); }

    public void clickOperationSign() {
        operationSign.click();
    }
    public void clickCalculate() {clickCalculate.click();
    }


    public String getWarningCalculatorMessageText() {
        return warningCalculatorMessage.getText();
    }

}