package tests;

import config.ConfigBase;
import dto.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenObjects.SplashScreen;

public class LoginTest extends ConfigBase {

    @Test
    public void loginTest(){
       boolean isLogged =
               new SplashScreen(driver)
               .checkVetsion("0.0.3")
               .fillEmail("john@gmail.com")
               .fillEPassword("Jj123456$")
               .clickLogin()
               .skipWizard()
               .isFabAddPresent();

        Assert.assertTrue(isLogged);

    }

    @Test
    public void complitLoginTest(){
        boolean isLogged =
                new SplashScreen(driver)
                        .checkVetsion("0.0.3")
                        .complitLogin(Credentials.builder().email("john@gmail.com").password("Jj123456$").build())
                        .skipWizard()
                        .isFabAddPresent();

        Assert.assertTrue(isLogged);
    }
}
