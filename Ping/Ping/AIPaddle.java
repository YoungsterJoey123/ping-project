import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AIPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AIPaddle extends Actor
{
    private int width;
    private int height;
    public AIPaddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        createImage();
    }
    /**
     * der bliver lavet en liste af all ball og efter det så for den x og y 
     * verdien og føgler efter ball
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
    
    /*
     * laver et billede
     */
    private void createImage()
    {
        setImage("f1_bil_bla.png");
        GreenfootImage image = getImage();
        image.scale(width,height);
    }
}
