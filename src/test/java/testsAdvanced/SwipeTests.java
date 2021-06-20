package testsAdvanced;

import advancedObjects.BaseScreenADV;
import advancedObjects.DragScreen;
import config.ConfigAdvancedPages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class SwipeTests extends ConfigAdvancedPages {

    @Test
    public void test(){
        new DragScreen(driver)
                .goToSwipe()
        .goToSwipeBasic()
        .swipeLeftToRight()
        .swipeRightToLeft();

    }

    @Test
    public void verticalSwipe(){
        new DragScreen(driver)
                .goToSwipe()
                .goToSwipeVertical()
                .swipeUpToDown();

    }
}
