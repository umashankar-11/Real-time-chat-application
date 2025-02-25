import java.util.ArrayList;
import java.util.List;

public class GroupChat {
    private String groupName;
    private List<String> members;

    public GroupChat(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    // Add members to the group
    public void addMember(String member) {
        members.add(member);
    }

    // Send a message to all members except the sender
    public void sendMessage(String sender, String message) {
        for (String member : members) {
            if (!member.equals(sender)) {
                System.out.println("Message to " + member + ": " + message);
            }
        }
    }

    public static void main(String[] args) {
        GroupChat group = new GroupChat("Tech Lovers");
        group.addMember("Alice");
        group.addMember("Bob");
        group.addMember("Charlie");

        group.sendMessage("Alice", "Hello everyone!"); // Sending message to group members
    }
}
