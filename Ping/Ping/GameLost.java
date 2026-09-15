import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLost extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    
    /**
     * Constructor for objects of class GameLost.
     * 
     */
    public GameLost()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1);
        GreenfootImage background = new GreenfootImage("Crash.jpg");
        background.scale (WORLD_WIDTH,WORLD_HEIGHT);
        setBackground(background);
        background.setColor( Color.WHITE );
        Greenfoot.playSound("gameover.mp3");
        background.drawString("DNF — Did Not Finish \n Press <Enter> to race again", WORLD_WIDTH / 2 - 80, WORLD_HEIGHT / 2);
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
