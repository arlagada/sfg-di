package vijay.springframeworks.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vijay.springframeworks.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return "Property Injected  : " +greetingService.goodMorning();
    }


}


