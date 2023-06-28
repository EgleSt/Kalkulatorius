import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LoginNegativeTest extends BaseTest {
    @Test
    void userLoginNegative(){
        LoginPage loginPage = new LoginPage(driver);
        String expectedLoginWarning = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";

        loginPage.setInputUserName("Jo");
        loginPage.setInputPassword("pa");
        loginPage.clickSubmit();

        Assertions.assertEquals(expectedLoginWarning, loginPage.getWarningLoginMessageText());




    }
}