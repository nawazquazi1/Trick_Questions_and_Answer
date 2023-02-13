import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Questions_38 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.amazon.in/HP-15s-Ryzen-15-6inch-Micro-Edge-15s-ey1508AU/dp/B0BJ2LZXD9/ref=sr_1_7?keywords=laptop&qid=1672384799&sprefix=l%2Caps%2C220&sr=8-7");
            BufferedImage bufferedImage = ImageIO.read(url);
            ImageIO.write(bufferedImage,"jpg",new File("C:\\program1\\url.jpg"));

            System.out.println("done.....");
        } catch (MalformedURLException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
