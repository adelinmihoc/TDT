package org.example.features;

import org.junit.Test;

public class LoginStory extends BaseStory {

    @Test
    public void login() {
        loginSteps.isTheLoginPage();
        loginSteps.login("adelinmihoc@gmail.com", "X9zfxhZeU6Py9WD");
    }
}
