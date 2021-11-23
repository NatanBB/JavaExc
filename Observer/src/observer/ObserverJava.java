package observer;

public class ObserverJava {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        new DivObserver(concreteSubject);
        new ModObserver(concreteSubject);

        concreteSubject.setValor(10, 10);
        concreteSubject.setValor(7, 2);
        concreteSubject.setValor(6, 5);

    }
}