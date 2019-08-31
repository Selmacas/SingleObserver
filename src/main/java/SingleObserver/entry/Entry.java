package SingleObserver.entry;


import SingleObserver.SingleObserver.MyObserver;
import SingleObserver.SingleObserver.SingleObservable;

public class Entry
{
    public static void main(String[] args)
    {
        SingleObservable singleton = SingleObservable.getInstanceOfSingleObservable();
        for(int i=0; i<=20; i++)
        {
            singleton.addObserver(new MyObserver("Observer " + i));
        }

        singleton.sendMessage("Ahoj svete");
        singleton.notifyObservers();

        singleton.sendMessage("Druha zprava");
        singleton.notifyObservers();
    }
}
