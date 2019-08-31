package SingleObserver.SingleObserver;

public class MyObserver implements Observer<String>
{
    private String message;
    private String name;

    public MyObserver()
    {
        name = "Nepojmenovany";
    }

    public MyObserver(String name)
    {
        this.name = name;
    }

    public void printMe()
    {
        System.out.println(name + " ma zpravu " + message);
    }

    @Override
    public void update(Observable observable, String data)
    {
        this.message = data;
        System.out.println(name + " obdrzel zpravu " + message);
    }
}
