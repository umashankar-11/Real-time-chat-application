import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;

public class PushNotificationUtil {
    // Send push notification using Firebase Cloud Messaging
    public static void sendPushNotification(String token, String title, String body) {
        Message message = Message.builder()
                .setToken(token) // The device token to send notification to
                .putData("title", title) // Title of the notification
                .putData("body", body) // Body content of the notification
                .build();

        // Send notification asynchronously
        FirebaseMessaging.getInstance().sendAsync(message);
    }
}
