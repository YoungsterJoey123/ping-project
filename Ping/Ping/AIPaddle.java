import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AIPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AIPaddle extends Actor
{
    protected int width;
    protected int height;
    public AIPaddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        createImage();
    }
    /**
     * Act - do whatever the AIPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        Ball ball = (Ball)getWorld().getObjects(Ball.class).get(0);

        if (ball.getX() < getX()){
            setLocation(getX() - 1, getY());
        }
        else if (ball.getX() > getX()){
            setLocation(getX() + 1, getY());
        }
    }
private void createImage()
    {
        setImage("f1_bil_bla.png");
        GreenfootImage image = getImage();
        image.scale(width,height);
    }
}
