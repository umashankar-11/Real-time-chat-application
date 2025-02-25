import java.time.LocalDateTime;

public class PresenceIndicator 
{
    private static LocalDateTime lastActive;

    public static void updateLastActive()
    {
        lastActive = LocalDateTime.now();
    }

    public static String getPresenceStatus() 
    {
        if (lastActive != null)
        {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive)) 
            {
                return "Online";
            } 
            else 
            {
                return "Offline"; 
            }
        }
        return "Offline"; 
    }

    public static void main(String[] args) 
    {
        updateLastActive(); 
        System.out.println("Presence Status: " + getPresenceStatus()); 
    }
}
import java.time.LocalDateTime;

public class PresenceIndicator 
{
    private static LocalDateTime lastActive;

    public static void updateLastActive() 
    {
        lastActive = LocalDateTime.now();
    }

    public static String getPresenceStatus() 
    {
        if (lastActive != null)
        {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive))
            {
                return "Online"; 
            } 
            else
            {
                return "Offline";
            }
        }
        return "Offline"; 
    }

    public static void main(String[] args) 
    {
        updateLastActive(); 
        System.out.println("Presence Status: " + getPresenceStatus()); 
    }
}
import java.time.LocalDateTime;

public class PresenceIndicator 
{
    private static LocalDateTime lastActive;

    public static void updateLastActive() 
    {
        lastActive = LocalDateTime.now();
    }

    public static String getPresenceStatus() 
    {
        if (lastActive != null) 
        {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive))
            {
                return "Online"; 
            } 
            else 
            {
                return "Offline"; 
            }
        }
        return "Offline"; 
    }

    public static void main(String[] args) 
    {
        updateLastActive(); 
        System.out.println("Presence Status: " + getPresenceStatus()); 
    }
}
import java.time.LocalDateTime;

public class PresenceIndicator 
{
    private static LocalDateTime lastActive;

    public static void updateLastActive() 
    {
        lastActive = LocalDateTime.now();
    }

    public static String getPresenceStatus() 
    {
        if (lastActive != null)
        {
            LocalDateTime now = LocalDateTime.now();
            if (now.minusMinutes(5).isBefore(lastActive)) 
            {
                return "Online"; 
            } 
            else 
            {
                return "Offlinse"; 
            }
        }
        return "Offline"; 
    }

    public static void main(String[] args) 
    {
        updateLastActive(); 
        System.out.println("Presence Status: " + getPresenceStatus()); 
    }
}
