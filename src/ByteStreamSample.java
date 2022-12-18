import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSample {
    public static void main(String[] args) throws IOException {
        
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            inStream = new FileInputStream("D:\\Coding\\data_testing\\source.txt");
            outStream = new FileOutputStream("D:\\Coding\\data_testing\\source2.txt");

            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
                System.out.print((char) content);
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            if (inStream != null) {
                inStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }
    }
}
