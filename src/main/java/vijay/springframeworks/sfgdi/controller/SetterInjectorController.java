package vijay.springframeworks.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vijay.springframeworks.sfgdi.services.GreetingService;

@Controller
public class SetterInjectorController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return "Setter Injected  : " + greetingService.goodMorning();
    }

}
