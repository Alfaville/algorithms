package patterns.mediator;

public interface Mediator {

    void send(String message, Colleague colleague);

}
