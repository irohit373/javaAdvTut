import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

public class workingWithImage {
    public static void main(String[] args) {
        int width =  1920;
        int height = 1080;

        BufferedImage image = null;

        image = readFromFile(width, height, image);
        
        writeToFile(image);
    }

    private static void writeToFile(BufferedImage image) {
        try {
            File output = new File("out.jpg");

            ImageIO.write(image, "jpg", output);

            System.out.println("Writing Complete");
        } catch (IOException e) {
            System.out.println("heeeeeeeeeeeee"+e);
        }
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {
            File samFile = new File("C:\\Users\\deshm\\OneDrive\\Pictures\\TRUST-YOURSELF-WHEN-THE-Desktop-1920x1080.jpg");
            
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(samFile);

            System.out.println("reading Complete." + image);
        } catch (IOException e) {
            System.out.println("awwwwwwwwwwwwwww"+e);
        }
        return image;
    }
}
