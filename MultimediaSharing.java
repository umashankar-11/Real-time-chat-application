import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultimediaSharing 
{   
    public static void uploadFile(File file, String destinationPath) throws IOException
    {
        try (FileInputStream inputStream = new FileInputStream(file);
             FileOutputStream outputStream = new FileOutputStream(destinationPath)) 
        {
            byte[] buffer = new byte[1024]; 
            int length;
            while ((length = inputStream.read(buffer)) > 0) 
            {
                outputStream.write(buffer, 0, length); 
            }
        }
    }
}
