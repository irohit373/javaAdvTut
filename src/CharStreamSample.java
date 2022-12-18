import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamSample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("D:\\Coding\\data_testing\\source.txt");
            writer = new FileWriter("D:\\Coding\\data_testing\\source3.txt");

            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
                System.out.print((char) content);
            }            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            reader.close();
            writer.close();
        
        }
    }
}
