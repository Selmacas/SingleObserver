package SingleObserver.SingleObserver;

public interface Observable
{
    void addObserver(Observer member);

    //Could be hidden in the implementation
    void notifyObservers();

    // Maybe the method "setValue(Object o)" Could be appropriate
}
