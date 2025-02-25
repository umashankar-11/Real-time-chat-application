import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionUtil {
    private static final String ALGORITHM = "AES";

    // Encrypt message using AES encryption algorithm
    public static String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted); // Returning encrypted data as base64 string
    }

    // Decrypt message using AES decryption algorithm
    public static String decrypt(String encryptedData, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedData = Base64.getDecoder().decode(encryptedData); // Decode from base64
        byte[] decrypted = cipher.doFinal(decodedData);
        return new String(decrypted); // Returning decrypted message as string
    }

    public static void main(String[] args) throws Exception {
        String key = "1234567890123456"; // AES key must be 16 bytes
        String encryptedMessage = encrypt("Hello World!", key);
        System.out.println("Encrypted: " + encryptedMessage); // Example output: Encrypted: Bl1vDd9m5ty=

        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Decrypted: " + decryptedMessage); // Example output: Decrypted: Hello World!
    }
}
