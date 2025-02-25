import java.util.List;
import java.util.stream.Collectors;

public class ChatSearch 
{
   
    public static List<String> searchMessages(List<String> messages, String keyword) 
    {
        return messages.stream()
                .filter(message -> message.contains(keyword)) 
                .collect(Collectors.toList()); 
    }

    public static void main(String[] args) 
    {
        List<String> messages = List.of("Hello there", "How are you?", "Let's meet later");
        String keyword = "Hello";

        List<String> results = searchMessages(messages, keyword);
        System.out.println("Search results: " + results);
    }
}
