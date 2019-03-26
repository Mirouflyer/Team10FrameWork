package logIn;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestLogIn extends CommonAPI {

    @Test
    public void getSignInToMyAccount() throws InterruptedException {
        LogInToAccount.getLogIn(driver);
    }
}
