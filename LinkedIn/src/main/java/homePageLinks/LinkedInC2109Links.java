package homePageLinks;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LinkedInC2109Links extends CommonAPI {

    @FindBy(xpath= "//a[@href='https://www.linkedin.com/legal/user-agreement?trk=uno-reg-guest-home-user-agreement']")
    public static WebElement userAgreementButtonWebElement;

    @FindBy(xpath= "//a[@href='https://www.linkedin.com/legal/privacy-policy?trk=uno-reg-guest-home-privacy-policy']")
    public static WebElement privacyPolicyButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Community Guidelines')]")
    public static WebElement communityGuidelinessButtonWebElement;

    @FindBy(xpath= "//a[@href='https://www.linkedin.com/legal/cookie-policy?trk=uno-reg-guest-home-cookie-policy']")
    public static WebElement cookiePolicyButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Copyright Policy')]")
    public static WebElement copyrightPolicyButtonWebElement;

    @FindBy(xpath= "//a[contains(text(),'Guest Controls')]")
    public static WebElement guestControlsButtonWebElement;

    public static WebElement getUserAgreementButtonWebElement() {
        return userAgreementButtonWebElement;
    }

    public static WebElement getPrivacyPolicyButtonWebElement() {
        return privacyPolicyButtonWebElement;
    }

    public static WebElement getCommunityGuidelinessButtonWebElement() {
        return communityGuidelinessButtonWebElement;
    }

    public static WebElement getCookiePolicyButtonWebElement() {
        return cookiePolicyButtonWebElement;
    }

    public static WebElement getCopyrightPolicyButtonWebElement() {
        return copyrightPolicyButtonWebElement;
    }

    public static WebElement getGuestControlsButtonWebElement() {
        return guestControlsButtonWebElement;
    }

    public void clickOnUserAgreementButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUserAgreementButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnPrivacyPolicyButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPrivacyPolicyButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnCommunityGuidelinessButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getCommunityGuidelinessButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnCookiePolicyButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCookiePolicyButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnCopyrightPolicyButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCopyrightPolicyButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnGuestControlsButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getGuestControlsButtonWebElement().click();
        driver.navigate().back();
    }

    public void clickOnLinkedInC2019Button() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnUserAgreementButtonWebElement();
        clickOnPrivacyPolicyButtonWebElement();
        clickOnCommunityGuidelinessButtonWebElement();
        clickOnCookiePolicyButtonWebElement();
        clickOnCopyrightPolicyButtonWebElement();
        clickOnGuestControlsButtonWebElement();
    }
}
