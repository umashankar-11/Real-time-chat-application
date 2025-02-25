import java.util.Timer;
import java.util.TimerTask;

public class SelfDestructMessage 
{
    private String message;
    private Timer timer;

    public SelfDestructMessage(String message, int seconds) 
    {
        this.message = message;
        this.timer = new Timer();
        timer.schedule(new TimerTask() 
                       {
            @Override
            public void run()
                           {
                message = null;
                System.out.println("Message has self-destructed.");
            }
        }, seconds * 1000); 
    }

    public String getMessage() 
    {
        return message;
    }

    public static void main(String[] args)
    {
        SelfDestructMessage selfDestructMessage = new SelfDestructMessage("This is a secret!", 5);
        System.out.println("Message: " + selfDestructMessage.getMessage()); 
    }
}
