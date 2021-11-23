package observer;

public class ModObserver implements Observer {
    private int modulo;
    public ModObserver(Subject concreteSubject) {
        concreteSubject.registerObserver(this);
    }

    @Override
    public void update(int valor, int divisor) {
        this.modulo = valor % divisor;
        System.out.println("Modulo: " + modulo);
    }
}