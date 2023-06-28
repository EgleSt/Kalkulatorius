
import org.junit.jupiter.api.Test;

public class OperationTest extends BaseTest {

    @Test
    void operations() {

        LoginPage loginPage = new LoginPage(driver);
        OperationsPage operationsPage = new OperationsPage(driver);

        loginPage.setInputUserName("Jonas");
        loginPage.setInputPassword("pass123");
        loginPage.clickSubmit();
        operationsPage.clickUsedOperations();
        operationsPage.clickFindOperation();

    }
}