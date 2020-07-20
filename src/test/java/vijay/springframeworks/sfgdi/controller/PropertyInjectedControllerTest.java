package vijay.springframeworks.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vijay.springframeworks.sfgdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}