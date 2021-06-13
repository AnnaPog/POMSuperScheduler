package tests;

import config.ConfigBase;
import dto.Credentials;
import dto.Event;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenObjects.SplashScreen;

public class EventTest extends ConfigBase {

    @Test
    public void eventCreationTest(){
        boolean isEventAdded = new SplashScreen(driver)
                .checkVetsion("0.0.3")
                .complitLogin(Credentials.builder()
                        .email("john@gmail.com")
                        .password("Jj123456$")
                        .build())
                .skipWizard()
                .initCreateNew()
                .fillCreationFormEvent(Event.builder()
                        .title("new Event")
                        .type("event")
                        .breaks(2)
                        .amount(50)
                        .build())
                .confirmCreationEvent()
                .isFabAddPresent();
        Assert.assertTrue(isEventAdded);
    }
}
