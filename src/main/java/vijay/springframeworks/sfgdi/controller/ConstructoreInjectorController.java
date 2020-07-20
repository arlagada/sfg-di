package vijay.springframeworks.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vijay.springframeworks.sfgdi.services.GreetingService;

@Controller
public class ConstructoreInjectorController {

    //@Qualifier("constructorGreetingServiceImpl")
    private GreetingService greetingService;


    public ConstructoreInjectorController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return "Constructeor Injected  : " + greetingService.goodMorning();
    }
}
