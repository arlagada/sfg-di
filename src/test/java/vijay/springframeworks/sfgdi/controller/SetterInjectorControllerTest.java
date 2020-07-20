package vijay.springframeworks.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vijay.springframeworks.sfgdi.services.ConstructorGreetingServiceImpl;

class SetterInjectorControllerTest {

    SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());

    }



    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}