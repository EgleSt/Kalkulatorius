import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorNegativeTest extends BaseTest {

    @Test
    void calculatorNegative() {

        LoginPage loginPage = new LoginPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String expectedCalculatorWarning = "Validacijos klaida: skaičius negali būti neigiamas";

        loginPage.setInputUserName("Jonas");
        loginPage.setInputPassword("pass123");
        loginPage.clickSubmit();
        calculatorPage.setInputFirstNumber(-2);
        calculatorPage.setInputSecondNumber(-3);
        calculatorPage.clickOperationSign();
        calculatorPage.clickCalculate();

        Assertions.assertEquals(expectedCalculatorWarning, calculatorPage.getWarningCalculatorMessageText());


    }
}