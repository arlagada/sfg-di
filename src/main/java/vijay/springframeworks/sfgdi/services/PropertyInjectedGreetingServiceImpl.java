package vijay.springframeworks.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String goodMorning() {
        return "Hello Good Morning  --- From Property Injection ";
    }

}
