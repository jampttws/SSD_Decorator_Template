import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageObject img1 = new ImageObject(80, 100);
        CanvasedImage c1 =  new CanvasedImage(img1, Color.red);
        CanvasedImage c2 =  new CanvasedImage(c1, Color.green);
        CanvasedImage c3 =  new CanvasedImage(c2, Color.blue);
        Window window = new Window(c3);
        window.setVisible(true);
    }

}
