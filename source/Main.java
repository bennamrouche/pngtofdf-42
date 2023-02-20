import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


public class Main {
    public static void main(String[] args) {

        try
        {
        if (args == null) {
            System.err.print("No Args");
            System.exit(1);
        }
//        System.out.print(args[0]);
        BufferedImage img = ImageIO.read(new File(args[0]));

            for (int j = 0; j < img.getHeight(); j++)
            {

                for (int i = 0;i <  img.getWidth(); i++)
                {
                int val = img.getRGB(i,j);
                String hex = Integer.toHexString(val);
                if (val == 0)
                {
                    System.out.print(0 + "," + hex + " ");
                }
                else
                {
                    if (hex.length()  == 8)
                        System.out.print(   10 + "," +"0x"+ hex.subSequence(2,8)+ " ");
                    else
                        System.out.print(10 + "," +"0x"+ hex + " ");


                }
            }
                System.out.print('\n');
        }

        }catch (Exception ex)
        {
           System.out.print("Error"+ ex.getMessage());
        }



    }
}