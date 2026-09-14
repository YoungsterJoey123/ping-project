import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleTwo extends Paddle
{
    public PaddleTwo(int width, int height)
    {
        super(width, height);
        createImage();
    }
    /**
     * Act - do whatever the Paddle2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() + 1, getY());
        checkPaddleReachWall();

    }
    public void checkPaddleReachWall(){
        if (getX() + width /2 >= getWorld().getWidth()){
            PingWorld world = (PingWorld) getWorld();
            world.removeObject(this);
            world.addObject(new PaddleTwo(width, height), 0, Greenfoot.getRandomNumber(200) + 100);
        }
    }
    
    private void createImage()
    {
        setImage("f1_bil_modstander.png");
        GreenfootImage image = getImage();
        image.scale(width,height);
        setRotation(180);

    }
}
