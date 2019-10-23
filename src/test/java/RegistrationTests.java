import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void signInLink() {
        mainPage.clickSignInLink();
        mainPage.completeRegistration();
    }

    @Test
    public void signInButton () {
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart();
        mainPage.completeSecondRegistrationPart();

    }
}

