
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class CanvasedImage extends Image {

    private Image image;
    private Color color;
    private int thickness = 6;

    public CanvasedImage(Image image, Color color) {

        this.image = image;
        this.color = color;
        this.width = image.getWidth()  + 2 * thickness;
        this.height = image.getHeight()  + 2 *thickness;
        this.x = image.getX() - thickness;
        this.y = image.getY() - thickness;
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);

       image.draw(g);

    }
}
