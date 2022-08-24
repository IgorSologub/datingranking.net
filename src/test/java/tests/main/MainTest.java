package tests.main;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.*;
import static constants.Constant.Reg.*;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("main");
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void headerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.headerMenuOpen();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void footerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            if (i == 9) {i++; goodTitlesCount++;}
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mainLogoLinkTest () {
        basePage.closePopup();
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void changeLanguageButtonTest () {
        basePage.closePopup();
        int goodUrlsCount = 0;
        for (int i = 2; i <= MAX_AMOUNT_LANGUAGE_CHANGE_BUTTONS + 1; i++) {
            basePage.waitOneSeconds();
            basePage.headerMenuOpen();
            basePage.waitOneSeconds();
            basePage.languageMenuOpen();
            basePage.waitOneSeconds();
            mainPage.changeLanguageButtonClick(i);
            if (basePage.checkUrls(LANGUAGE_URLS)) { goodUrlsCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(MAX_AMOUNT_LANGUAGE_CHANGE_BUTTONS, goodUrlsCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void learnMoreRegButtonTest () {
        basePage.closePopup();
        mainPage.learnMoreRegButtonClick();
        basePage.nextTab();
        basePage.waitThirtySeconds();
        assertTrue(basePage.checkTitles(REG_TITLES));
        basePage.closeTabAndMoveToNext();
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void visitSiteRegButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_VISIT_SITE_REG_BUTTONS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.visitSiteRegButtonClick(i);
            basePage.nextTab();
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_VISIT_SITE_REG_BUTTONS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void readReviewButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_READ_REVIEW_BUTTONS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.readReviewButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_READ_REVIEW_BUTTONS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void visitSiteInTextRegButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_VISIT_SITE_IN_TEXT_REG_BUTTONS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.visitSiteInTextRegButtonClick(i);
            basePage.nextTab();
            basePage.waitThirtySeconds();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_VISIT_SITE_IN_TEXT_REG_BUTTONS_MAIN_PAGE, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void readFullReviewButtonTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_READ_FULL_REVIEW_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.readFullReviewButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_READ_FULL_REVIEW_MAIN_PAGE, goodTitlesCount);
    }

}
