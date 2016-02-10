package tests.basket;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BasketTests extends BasketFixture {

    private static final Logger log = Logger.getLogger(BasketTests.class);


    @Test
    public void test1_addProduct() {

        getHomePage().closeBlurb();
        getHomePage().switchToElectronicPage();

        File screenShot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(screenShot,
                    new File("/media/alexander/HDD/Workspace/Projects/QA/qa_course_maven/screens/screen_1.png"));

        } catch (IOException e) {

            e.printStackTrace();

        }

        getBasketPage().switchToMobile();

        File screenShot2 = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(screenShot2,
                    new File("/media/alexander/HDD/Workspace/Projects/QA/qa_course_maven/screens/screen2.png"));

        } catch (IOException e) {

            e.printStackTrace();

        }

        getProductPage().switchToFirstProductPage();

        File screenShot3 = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(screenShot3,
                    new File("/media/alexander/HDD/Workspace/Projects/QA/qa_course_maven/screens/screen3.png"));

        } catch (IOException e) {

            e.printStackTrace();

        }

        getBasketPage().addProductToBasket();

        File screenShot4 = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(screenShot4,
                    new File("/media/alexander/HDD/Workspace/Projects/QA/qa_course_maven/screens/screen4.png"));

        } catch (IOException e) {

            e.printStackTrace();

        }

        Assert.assertTrue(getBasketPage().textPresent(), "success page with iPhone 6 Plus 16GB Space Gray");


    }

}
