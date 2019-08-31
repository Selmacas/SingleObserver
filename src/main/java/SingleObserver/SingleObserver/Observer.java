package SingleObserver.SingleObserver;

public interface Observer<T>
{
    void update(Observable observable, T data);
}
