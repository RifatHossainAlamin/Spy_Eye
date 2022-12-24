import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

class Simple {

    public static int timer(int n){
        int m=n*1000;
        return m;
    }

    public static void main(String [] args){

        int x1 = 2;
        String x2 ="C:\\Users\\Public\\Microsoft\\";
        int x3 = 7200;

        try {

            Thread.sleep(timer(x1));
            for(int i=1;i<=x3;i++) {
                // name of picture:
                LocalDateTime myObj = LocalDateTime.now();
                int h,m,s,d,mo;
                h= myObj.getHour();
                m= myObj.getMinute();
                s= myObj.getSecond();
                d= myObj.getDayOfMonth();
                mo= myObj.getMonthValue();
                String a,b,c,day,month;
                a=Integer.toString(h);
                b=Integer.toString(m);
                c=Integer.toString(s);
                day=Integer.toString(d);
                month=Integer.toString(mo);
                String name=a+"_"+b+"_"+c+"_"+day+"_"+month;
                //

                Thread.sleep(1000);
                Robot r = new Robot();

                // It saves screenshot to desired path
                String path = x2 + name + ".jpg";

                // Used to get ScreenSize and capture image
                Rectangle capture =
                        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image, "jpg", new File(path));
                System.out.println("Screenshot saved");
            }
//                    l2.setText("End");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);

        }




    }

}


