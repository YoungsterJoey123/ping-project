import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knap extends Actor
{
    private String tekst;

    public Knap(String tekst)
    {
        this.tekst = tekst;
        GreenfootImage billede = new GreenfootImage(150, 40);
        billede.setColor(Color.WHITE);
        billede.fillRect(0, 0, 150, 40);
        billede.setColor(Color.BLACK);
        billede.drawRect(0, 0, 149, 39);
        billede.setFont(new Font(24));
        billede.drawString(tekst, 10, 30);
        setImage(billede);
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            if (tekst.equals("Singleplayer"))
            {
                Greenfoot.setWorld(new PingWorld(true));
            }
            else if (tekst.equals("AI"))
            {
                Greenfoot.setWorld(new AiWorld(true));
            }
        }
    }
}
