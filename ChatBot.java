import java.util.HashMap;
import java.util.Map;

public class ChatBot {
    private static final Map<String, String> faqs = new HashMap<>();

    static {
        faqs.put("What is your name?", "I am your friendly chatbot!");
        faqs.put("How can I help you?", "You can ask me about our services!");
    }

    // Get the chatbot response for a user's question
    public static String getResponse(String userQuestion) {
        return faqs.getOrDefault(userQuestion, "Sorry, I didn't understand that.");
    }

    public static void main(String[] args) {
        String userQuestion = "What is your name?";
        System.out.println(getResponse(userQuestion)); // Output: I am your friendly chatbot!
    }
}
