package vijay.springframeworks.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vijay.springframeworks.sfgdi.services.ConstructorGreetingServiceImpl;

class ConstructoreInjectorControllerTest {

    ConstructoreInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructoreInjectorController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}