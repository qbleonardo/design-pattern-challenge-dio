package observer;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers(String productName, String subscribeChoice) {
        observers.forEach(o -> {
            if ("S".equals(subscribeChoice)) {
                o.update(productName);
            } else if ("N".equals(subscribeChoice)) {
                System.out.println("Programa Encerrado.");
            }
        });
    }

    public void addProduct(String name, String subscribeChoice) {
        notifyObservers(name, subscribeChoice);
    }
}