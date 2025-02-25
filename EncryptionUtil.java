import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionUtil 
{
    private static final String ALGORITHM = "AES";

    public static String encrypt(String data, String key) throws Exception 
    {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted); 
    }
    
    public static String decrypt(String encryptedData, String key) throws Exception
    {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        byte[] decrypted = cipher.doFinal(decodedData);
        return new String(decrypted);
    }

    public static void main(String[] args) throws Exception 
    {
        String key = "1234567890123456"; 
        String encryptedMessage = encrypt("Hello World!", key);
        System.out.println("Encrypted: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Decrypted: " + decryptedMessage); 
    }
}
