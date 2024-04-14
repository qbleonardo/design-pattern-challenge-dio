package observer;

public interface CatalogObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers(String productName, String subscribeChoice);
}
