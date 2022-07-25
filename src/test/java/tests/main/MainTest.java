package tests.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.*;
import static constants.Constant.Reg.*;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("main");
        basePage.goToUrl(MAIN_PAGE_URL);
        basePage.waitOneSeconds();
        basePage.closePopup();
    }

    @Test
    public void headerButtonsTest () {
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

    @Test
    public void footerButtonsTest () {
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

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void changeLanguageButtonTest () {
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

    @Test
    public void learnMoreRegButtonTest () {
        mainPage.learnMoreRegButtonClick();
        basePage.nextTab();
        basePage.waitOneMinute();
        assertTrue(basePage.checkTitles(REG_TITLES));
        basePage.closeTabAndMoveToNext();
    }

    @Test
    public void visitSiteRegButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_VISIT_SITE_REG_BUTTONS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.visitSiteRegButtonClick(i);
            basePage.nextTab();
            basePage.waitOneMinute();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_VISIT_SITE_REG_BUTTONS_MAIN_PAGE, goodTitlesCount);
    }

    @Test
    public void readReviewButtonTest () {
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

    @Test
    public void visitSiteInTextRegButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_VISIT_SITE_IN_TEXT_REG_BUTTONS_MAIN_PAGE; i++) {
            basePage.waitOneSeconds();
            mainPage.visitSiteInTextRegButtonClick(i);
            basePage.nextTab();
            basePage.waitOneMinute();
            if (basePage.checkTitles(REG_TITLES)) { goodTitlesCount++; }
            basePage.waitOneSeconds();
            basePage.closeTabAndMoveToNext();
        }
        assertEquals(NUMBER_OF_VISIT_SITE_IN_TEXT_REG_BUTTONS_MAIN_PAGE, goodTitlesCount);
    }

    @Test
    public void readFullReviewButtonTest () {
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
