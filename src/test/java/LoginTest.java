
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    void userLogin(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setInputUserName("Jonas");
        loginPage.setInputPassword("pass123");
        loginPage.clickSubmit();


    }
}