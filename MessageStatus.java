import java.util.HashMap;
import java.util.Map;

public class MessageStatus {
    private Map<String, String> messageStatus = new HashMap<>();

    // Simulate sending a message
    public void sendMessage(String messageId) {
        messageStatus.put(messageId, "Sent"); // Message is sent
        // Simulate read receipt
        messageStatus.put(messageId, "Read"); // Message is read
    }

    // Get status of a message
    public String getStatus(String messageId) {
        return messageStatus.getOrDefault(messageId, "Unknown Status");
    }

    public static void main(String[] args) {
        MessageStatus statusTracker = new MessageStatus();
        String messageId = "msg123";
        statusTracker.sendMessage(messageId);

        System.out.println("Message Status: " + statusTracker.getStatus(messageId)); // Output: Read
    }
}
