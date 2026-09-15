import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWon extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    /**
     * Constructor for objects of class GameWon.
     * 
     */
    public GameWon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1); 
        GreenfootImage background = new GreenfootImage("Win.jpeg");
        background.scale (WORLD_WIDTH,WORLD_HEIGHT);
        setBackground(background);
        background.setColor( Color.WHITE );
        Greenfoot.playSound("Win.mp3");
        background.drawString("You are the GOAT", WORLD_WIDTH / 2 - 80, WORLD_HEIGHT / 2);
        
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
