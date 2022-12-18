import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializationExample {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Student student1 = new Student("Tushar", 18 , "23, North, California");

        String filenae = "D:\\Coding\\data_testing\\java_serialization.txt";
        
        // Serialization
        try {
            FileOutputStream fileout = new FileOutputStream(filenae);
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(student1);

            out.close();
            fileout.close();

            System.out.println("Object is Serialized");
        } catch (IOException e) {
            System.out.println("IOException is caught");
        }

        // deSerialzation
        try{
            FileInputStream filein = new FileInputStream(filenae);
            ObjectInputStream in = new ObjectInputStream(filein);
            Student student2 = (Student) in.readObject();

            System.out.println("deSerialized the object");
            System.out.println(student2.toString());

            in.close();
            filein.close();
        }catch(Exception e){
            System.out.println("Errr on deserialization");
        }
    }
}
