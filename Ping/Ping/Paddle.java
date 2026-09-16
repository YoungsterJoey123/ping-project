import greenfoot.*;


/**
 * A paddle is an object that goes back and forth. Though it would be nice if balls would bounce of it.
 * 
 * @author The teachers 
 * @version 1
 */
public class Paddle extends Actor
{
    private int width;
    private int height;
    private int dx;
    private GameManager gameManager; 
    
    /**
     * Constructs a new paddle with the given dimensions.
     */
    public Paddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        dx = 3;
        createImage();
        this.gameManager = gameManager;
    }
    
    

    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeDirection();
    }    

    /**
     * Will rotate the paddle 180 degrees if the paddle is at worlds edge.
     */
    private void changeDirection()
    {
        /**
         * Opgave 1. Player Paddel styres med enten "a" eller "d" og "left" 
         * eller "right"
         * Når vi trykker enten "d" eller "right" tilføjer vi dx(2) på 
         * x-koordinaten. Det modsatte gøres når vi trykker på "a" eller "left"
         */
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setLocation(getX() + dx, getY());
        }
        if(Greenfoot.isKeyDown("left")|| Greenfoot.isKeyDown("a")){
            setLocation(getX() - dx, getY());
        } 
    }

    /**
     * Vi sætter Paddel til et nyt billede.
     * Efter dette definere vi nu image på linje 67 ,således at vi på linje 68 kan bruge Greenfoot kommandoen scale til at give Paddlen den rigtige
     * width og height.
     * Dette gøres også for, PaddelTwo, Ball og PingWorld.
    */
    
    private void createImage()
    {
        setImage("f1_bil_rd.png");
        GreenfootImage image = getImage();
        image.scale(width,height);
    }

}
