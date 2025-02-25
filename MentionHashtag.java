import java.util.List;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MentionHashtag 
{ 
    public static List<String> extractMentions(String message)
    {
        Pattern pattern = Pattern.compile("@(\\w+)");
        Matcher matcher = pattern.matcher(message);
        return matcher.results()
                .map(match -> match.group(1))
                .collect(Collectors.toList());
    }

    public static List<String> extractHashtags(String message) 
    {
        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(message);
        return matcher.results()
                .map(match -> match.group(1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) 
    {
        String message = "Hey @john, let's meet at the #park.";
        System.out.println("Mentions: " + extractMentions(message)); 
        System.out.println("Hashtags: " + extractHashtags(message)); 
    }
}
