package algorithms.patterns.mediator;

import java.util.ArrayList;

public class ColleagueMediator implements Mediator {

    private final ArrayList<Colleague> colleagues;

    public ColleagueMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        this.colleagues.stream()
                .filter(colleague -> colleague != originator)
                .forEach(colleague -> colleague.receive(message));
    }

}
