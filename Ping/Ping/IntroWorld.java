import greenfoot.*;


/**
 * Write a description of class IntroWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    
    /**
     * Constructor for objects of class IntroWorld.
     */
    public IntroWorld()
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        GreenfootImage background = new GreenfootImage("tpose.jpeg");
        background.scale (WORLD_WIDTH,WORLD_HEIGHT);
        setBackground(background);
        background.setColor(Color.WHITE);
        background.drawString("Welcome to the track.\nHit <Enter> to start the race..", WORLD_WIDTH / 2 - 80, WORLD_HEIGHT / 2);
        
    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new PingWorld(true));
        }
    }
    
}
