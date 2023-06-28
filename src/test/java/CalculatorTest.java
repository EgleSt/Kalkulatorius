

import org.junit.jupiter.api.Test;



public class CalculatorTest extends BaseTest {

    @Test
    void calculator() {

        LoginPage loginPage = new LoginPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        loginPage.setInputUserName("Jonas");
        loginPage.setInputPassword("pass123");
        loginPage.clickSubmit();
        calculatorPage.setInputFirstNumber(2);
        calculatorPage.setInputSecondNumber(3);
        calculatorPage.clickOperationSign();
        calculatorPage.clickCalculate();


    }
}