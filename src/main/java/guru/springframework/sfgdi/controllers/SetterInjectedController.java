package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*
    Created to demonstrate setter injected controllers
 */

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // sets the Greeting Service
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Gets greeting from the service
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
