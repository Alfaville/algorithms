package algorithms.patterns.mediator;

public class Application {

    public static void main(String[] args) {
        ColleagueMediator mediator = new ColleagueMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);

        mediator.addColleague(desktop);
        mediator.addColleague(mobile);

        desktop.send("Hello World");
        mobile.send("Hello");
    }

}
