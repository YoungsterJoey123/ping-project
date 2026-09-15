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
    /**
     * Der tages Paddlen x-koordinaten og tilføjer det med widthen af Paddlen.
     * Dette divideres med 2, så man finder spidsen af bilen.
     * 
     * Vi definere PingWorld som world, hvor efter vi kun vil have PingWorld,
     * dette gøres ved at typecast PingWorld fra World, da PingWorld er en Subclass af World,
     * da vi har brug for at det er PingWorld der fjerner objektet.
     * 
     * Vi fjerner her efter "this" hvilket referere tilbage til den Class vi arbejer i.
     * Der tilføjes nu en ny PaddelTwo, hvor vi benytter os af Greenfoot til at fine et tilfældigt tal, melle 0 og 299.
     */
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
