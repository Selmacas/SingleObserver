package SingleObserver.SingleObserver;

import java.util.ArrayList;

public class SingleObservable implements Observable
{
// implementace Singleton
    private static final SingleObservable singletonObservable = new SingleObservable();

    private SingleObservable(){};
    public static SingleObservable getInstanceOfSingleObservable()
    {
        return singletonObservable;
    }


// implementace Observer
    private ArrayList<Observer> list = new ArrayList<>();
    private String message;

    public void sendMessage(String message)
    {
        this.message=message;
    }
    
    @Override
    public void addObserver(Observer member)
    {
        list.add(member);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer i: list)
        {
            i.update(this, message);
        }
    }


}
