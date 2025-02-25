import java.util.Timer;
import java.util.TimerTask;

public class SelfDestructMessage {
    private String message;
    private Timer timer;

    // Constructor to set self-destruct timer
    public SelfDestructMessage(String message, int seconds) {
        this.message = message;
        this.timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                message = null; // Self-destruct the message after the time expires
                System.out.println("Message has self-destructed.");
            }
        }, seconds * 1000); // Set the time for self-destruction
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        SelfDestructMessage selfDestructMessage = new SelfDestructMessage("This is a secret!", 5);
        System.out.println("Message: " + selfDestructMessage.getMessage()); // Output: This is a secret!
    }
}
