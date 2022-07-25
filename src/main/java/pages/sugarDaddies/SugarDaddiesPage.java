package pages.sugarDaddies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.QUIZ_PAGE_URL;

public class SugarDaddiesPage extends BasePage {

    public SugarDaddiesPage (WebDriver driver) {super(driver);}

    private final By startButton = By.xpath("//a[@class='XtfnY4oP2 nTiAKDh']");

    public SugarDaddiesPage visitSiteRegButtonClick (int numButton) {
        By visitSiteRegButton = By.xpath("(//a[@class[contains(.,'XtfnY4oP2 vaK955')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public SugarDaddiesPage visitSiteRegButtonInTopSitesForSugarDatingClick (int numButton) {
        By visitSiteRegButtonInTopSitesForSugarDating = By.xpath("(//a[@class[contains(.,'XtfnY4oP2 y6P7yes9LhJ')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButtonInTopSitesForSugarDating).click();
        return this;
    }

    public SugarDaddiesPage sendMessageRegButtonClick (int numButton) {
        By sendMessageRegButton = By.xpath("(//a[@class[contains(.,'XtfnY4oP2 f58V8qwG')]])[" + numButton + "]");
        driver.findElement(sendMessageRegButton).click();
        return this;
    }

    public SugarDaddiesPage loadMoreRegButtonClick () {
        By loadMoreRegButton = By.xpath("//a[@class[contains(.,'li2eNkfYmJ tHPeXh')]]");
        driver.findElement(loadMoreRegButton).click();
        return this;
    }

    public SugarDaddiesPage addProfilesRegButtonClick () {
        By addProfilesRegButton = By.xpath("//a[@class[contains(.,'cyKosGyF9a')]]");
        driver.findElement(addProfilesRegButton).click();
        return this;
    }

    public SugarDaddiesPage startButtonClick () {
        driver.findElement(startButton).click();
        return this;
    }

    public Boolean startButtonCheck () {
        return driver.getCurrentUrl().contains(QUIZ_PAGE_URL);
    }

    public  SugarDaddiesPage findSugarCityButtonClick (int numButton) {
        By findSugarCityButton = By.xpath("(//a[@class='zS-LuDN '])[" + numButton + "]");
        driver.findElement(findSugarCityButton).click();
        return this;
    }

    public  SugarDaddiesPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='TvyCKy3Y'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public  SugarDaddiesPage readFullReviewButtonClick (int numButton) {
        By readFullReview = By.xpath("(//a[@class='pxQo0oO'])[" + numButton + "]");
        driver.findElement(readFullReview).click();
        return this;
    }

}
