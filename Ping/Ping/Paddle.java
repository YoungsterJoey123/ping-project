import greenfoot.*;


/**
 * A paddle is an object that goes back and forth. Though it would be nice if balls would bounce of it.
 * 
 * @author The teachers 
 * @version 1
 */
public class Paddle extends Actor
{
    public int width;
    public int height;
    public int dx;

    /**
     * Constructs a new paddle with the given dimensions.
     */
    public Paddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        dx = 2;
        createImage();
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
        //Check to see if we are touching the outer boundaries of the world:
        // IF we are touching the right boundary OR we are touching the left boundary:
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setLocation(getX() + dx, getY());
        }
        if(Greenfoot.isKeyDown("left")|| Greenfoot.isKeyDown("a")){
            setLocation(getX() - dx, getY());
        } 
    }

    /**
     * Creates and sets an image for the paddle, the image will have the same dimensions as the paddles width and height.
     */
    private void createImage()
    {
        setImage("f1_bil_rd.png");
        GreenfootImage image = getImage();
        image.scale(width,height);
    }

}
