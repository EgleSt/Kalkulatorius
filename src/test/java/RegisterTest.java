
import org.junit.jupiter.api.Test;


public class RegisterTest extends BaseTest {

    @Test
    void registerUser() {
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.clickMyNewAccount();
        registerPage.setInputUserName("Jonas");
        registerPage.setInputPassword("pass123");
        registerPage.setInputPasswordConfirm("pass123");
        registerPage.clickCreate();
    }
}


