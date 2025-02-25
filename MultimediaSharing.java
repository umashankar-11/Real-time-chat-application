import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultimediaSharing {
    // Upload a file from local storage to a destination path
    public static void uploadFile(File file, String destinationPath) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(file);
             FileOutputStream outputStream = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024]; // Buffer to read the file in chunks
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length); // Write data to the destination
            }
        }
    }
}
