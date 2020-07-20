package vijay.springframeworks.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println(" From Controller Saying Hello");
        return "From Controller Returning Bye";
    }
}
