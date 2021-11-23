package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private int valor;
    private int divisor;
    private ArrayList<Observer> observers;

    public ConcreteSubject() {
       observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        System.out.println(this.valor + " / " + this.divisor + ": ");
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(this.valor, this.divisor);
        }
        System.out.println("\n");
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor, int divisor) {
        this.valor = valor;
        this.divisor = divisor;
        valorChanged();
    }

    public void valorChanged() {
        notifyObserver();
    }
}