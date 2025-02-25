import java.util.HashMap;
import java.util.Map;

public class MessageStatus 
{
    private Map<String, String> messageStatus = new HashMap<>();

    public void sendMessage(String messageId)
    {
        messageStatus.put(messageId, "Sent"); 
        messageStatus.put(messageId, "Read"); 
    }

    public String getStatus(String messageId) 
    {
        return messageStatus.getOrDefault(messageId, "Unknown Status");
    }

    public static void main(String[] args)
    {
        MessageStatus statusTracker = new MessageStatus();
        String messageId = "msg123";
        statusTracker.sendMessage(messageId);

        System.out.println("Message Status: " + statusTracker.getStatus(messageId)); 
    }
}
