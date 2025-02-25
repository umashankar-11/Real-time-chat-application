import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;

import java.io.File;

public class CloudStorage 
{
    private static final AmazonS3 s3Client = AmazonS3ClientBuilder.standard().build();
    private static final String BUCKET_NAME = "your-bucket-name"; 

    public static void uploadFile(File file) 
    {
        s3Client.putObject(new PutObjectRequest(BUCKET_NAME, file.getName(), file));
    }

    public static void main(String[] args) 
    {
        File file = new File("path/to/your/file.txt");
        uploadFile(file);
        System.out.println("File uploaded successfully!");
    }
}
