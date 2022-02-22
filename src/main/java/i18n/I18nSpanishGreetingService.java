package i18n;

import guru.springframework.sfgdi.services.GreetingService;

public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
