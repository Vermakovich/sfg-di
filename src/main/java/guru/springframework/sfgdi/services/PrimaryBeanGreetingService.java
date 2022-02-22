package guru.springframework.sfgdi.services;

public class PrimaryBeanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello, Primary";
    }
}
