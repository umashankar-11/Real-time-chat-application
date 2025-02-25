import java.time.LocalDateTime;

public class PresenceIndicator {
    private static LocalDateTime lastActive;

    // Update last activity time
    public static void updateLastActive() {
        lastActive = LocalDateTime.now();
    }

    // Get presence status based on activity time
    public static String getPresenceStatus() {
        if (lastActive != null) {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive)) {
                return "Online"; // User was active in the last 5 minutes
            } else {
                return "Offline"; // User was inactive for more than 5 minutes
            }
        }
        return "Offline"; // Default status if no activity recorded
    }

    public static void main(String[] args) {
        updateLastActive(); // User is active now
        System.out.println("Presence Status: " + getPresenceStatus()); // Output: Online
    }
}
import java.time.LocalDateTime;

public class PresenceIndicator {
    private static LocalDateTime lastActive;

    // Update last activity time
    public static void updateLastActive() {
        lastActive = LocalDateTime.now();
    }

    // Get presence status based on activity time
    public static String getPresenceStatus() {
        if (lastActive != null) {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive)) {
                return "Online"; // User was active in the last 5 minutes
            } else {
                return "Offline"; // User was inactive for more than 5 minutes
            }
        }
        return "Offline"; // Default status if no activity recorded
    }

    public static void main(String[] args) {
        updateLastActive(); // User is active now
        System.out.println("Presence Status: " + getPresenceStatus()); // Output: Online
    }
}
import java.time.LocalDateTime;

public class PresenceIndicator {
    private static LocalDateTime lastActive;

    // Update last activity time
    public static void updateLastActive() {
        lastActive = LocalDateTime.now();
    }

    // Get presence status based on activity time
    public static String getPresenceStatus() {
        if (lastActive != null) {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive)) {
                return "Online"; // User was active in the last 5 minutes
            } else {
                return "Offline"; // User was inactive for more than 5 minutes
            }
        }
        return "Offline"; // Default status if no activity recorded
    }

    public static void main(String[] args) {
        updateLastActive(); // User is active now
        System.out.println("Presence Status: " + getPresenceStatus()); // Output: Online
    }
}
import java.time.LocalDateTime;

public class PresenceIndicator {
    private static LocalDateTime lastActive;

    // Update last activity time
    public static void updateLastActive() {
        lastActive = LocalDateTime.now();
    }

    // Get presence status based on activity time
    public static String getPresenceStatus() {
        if (lastActive != null) {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive)) {
                return "Online"; // User was active in the last 5 minutes
            } else {
                return "Offlinse"; // User was inactive for more than 5 minutes
            }
        }
        return "Offline"; // Default status if no activity recorded
    }

    public static void main(String[] args) {
        updateLastActive(); // User is active now
        System.out.println("Presence Status: " + getPresenceStatus()); // Output: Online
    }
}
