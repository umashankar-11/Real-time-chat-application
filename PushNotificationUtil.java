import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;

public class PushNotificationUtil 
{
    public static void sendPushNotification(String token, String title, String body) 
    {
        Message message = Message.builder()
                .setToken(token) 
                .putData("title", title) 
                .putData("body", body) 
                .build();

        FirebaseMessaging.getInstance().sendAsync(message);
    }
}
