package org.example.features;

import org.junit.Test;

public class LoginStory extends BaseStory {

    @Test
    public void login() {
        loginSteps.isTheLoginPage();
        loginSteps.login("mihaimehi@gmail.com", "Samsungs10!");
    }
}
