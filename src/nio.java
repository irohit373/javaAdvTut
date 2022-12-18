import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class nio {
    public static void main(String[] args) throws IOException {
        
        // FileInputStream filein = new FileInputStream("D://Coding//data_testing//source.txt");
        // FileChannel readChannel = filein.getChannel();
        // ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        // int result = readChannel.read(readBuffer);
        // System.out.println("file read Succesfully " + result);

        FileOutputStream fileout = new FileOutputStream("D://Coding//data_testing//source3.txt");
        FileChannel writeChannel = fileout.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "this is a nio channel testing that read write using channels in java";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("Writted Succesfully");


        fileout.close();
    }
}
