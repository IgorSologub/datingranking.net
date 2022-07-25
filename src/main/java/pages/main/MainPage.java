package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    private final By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[1]");
    private final By learnMoreRegButton = By.xpath("//a[contains(@class,'XtfnY4oP2 pW4xE')]");

    public MainPage changeLanguageButtonClick (int numButton) {
        By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[" + numButton + "]");
        driver.findElement(changeLanguageButton).click();
        return this;
    }

    public MainPage learnMoreRegButtonClick () {
        driver.findElement(learnMoreRegButton).click();
        return this;
    }

    public MainPage visitSiteRegButtonClick(int numButton) {
        By visitSiteRegButton = By.xpath("(//a[contains(@class,'XtfnY4oP2 ew71nfRT')])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public MainPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='BAAycV'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public MainPage visitSiteInTextRegButtonClick(int numButton) {
        By visitSiteInTextRegButton = By.xpath("(//a[contains(@class,'XtfnY4oP2 qa9Iwu8QS jsd-bG')])[" + numButton + "]");
        driver.findElement(visitSiteInTextRegButton).click();
        return this;
    }

    public MainPage readFullReviewButtonClick (int numButton) {
        By readFullReviewButton = By.xpath("(//a[@class='D24w20HPZIV'])[" + numButton + "]");
        driver.findElement(readFullReviewButton).click();
        return this;
    }

}
