import processing.core.PApplet;

public class Processing extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x=0,speed=1;

    public static void main(String[] args)
    {
        PApplet.main("Processing" , args);
    }
    public void settings()
    {
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup()
    {
    }

    @Override
    public void draw() {
        ellipse(x,HEIGHT/5,20,20);
        ellipse((2*x),(2*HEIGHT)/5,20,20);
        ellipse((3*x),(3*HEIGHT)/5,20,20);
        ellipse((4*x),(4*HEIGHT)/5,20,20);
        x=x+speed;
    }

}
