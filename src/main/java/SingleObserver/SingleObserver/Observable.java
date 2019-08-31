package SingleObserver.SingleObserver;

public interface Observable
{
    void addObserver(Observer member);
    void notifyObservers();
}
