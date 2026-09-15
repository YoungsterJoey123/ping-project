import greenfoot.*;
import greenfoot.GreenfootImage;


/**
 * A Ball is a thing that bounces of walls and paddles (or at least i should).
 * 
 * @author The teachers 
 * @version 1
 */
public class Ball extends Actor
{
    private static final int BALL_SIZE = 25;
    private static final int BOUNCE_DEVIANCE_MAX = 5;
    private static final int STARTING_ANGLE_WIDTH = 90;
    private static final int DELAY_TIME = 100;
    private int width;
    private int height;
    private int speed;
    private boolean hasBouncedHorizontally;
    private boolean hasBouncedVertically;
    private int delay;
    private GameManager gameManager; 

    /**
     * Contructs the ball and sets it in motion!
     */
    public Ball(int width, int height, GameManager gameManager)
    {
        this.width = width;
        this.height = height;
        this.gameManager = gameManager;
        createImage();
        init();
    }

    /**
     * Creates and sets an image of a black ball to this actor.
     */
    private void createImage()
    {
        setImage("f1_bold.png");
        GreenfootImage image = getImage();
        image.scale(width,height);
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (delay > 0)
        {
            delay--;
        }
        else
        {
            increaseSpeed();
            move(speed);
            checkBounceOffPaddle();
            checkBounceOffPaddleTwo();
            checkBounceOffWalls();
            checkBounceOffCeiling();
            checkRestart();
        }
    }    
    /**
     * Returns true if the ball is touching one of the side walls.
     */
    private boolean isTouchingSides()
    {
        return (getX() <= BALL_SIZE/2 || getX() >= getWorld().getWidth() - BALL_SIZE/2);
    }

    /**
     * Returns true if the ball is touching the ceiling.
     */
    private boolean isTouchingCeiling()
    {
        return (getY() <= BALL_SIZE/2);
    }

    /**
     * Returns true if the ball is touching the floor.
     */
    private boolean isTouchingFloor()
    { 
        return (getY() >= getWorld().getHeight() - BALL_SIZE/2);
    }
    
    public void checkBounceOffPaddleTwo(){
        if (getIntersectingObjects(PaddleTwo.class).size() > 0 && getRotation() > 180)
        {
             setRotation(360-getRotation());
             gameManager.paddleHits();
             GreenfootSound hit = new GreenfootSound("ding.mp3");//Det tilføjes lyd til Ball, når den hopper af en Paddel.
             hit.play(); 
            
        }
    }
    
    public void checkBounceOffPaddle(){
        if (getIntersectingObjects(Paddle.class).size() > 0 && getRotation() < 180)
        {
             setRotation(360-getRotation());
             gameManager.paddleHits();
             GreenfootSound hit = new GreenfootSound("ding.mp3");//Det tilføjes lyd til Ball, når den hopper af en Paddel.
             hit.play(); 
            
        }
    }
    /**
     * Check to see if the ball should bounce off one of the walls.
     * If touching one of the walls, the ball is bouncing off.
     */
    private void checkBounceOffWalls()
    {
        if (isTouchingSides())
        {
            if (! hasBouncedHorizontally)
            {
                revertHorizontally();
                GreenfootSound hit = new GreenfootSound("ding.mp3");//Det tilføjes lyd til Ball, når den hopper af sidderne.
                hit.play();
            }
        }
        else
        {
            hasBouncedHorizontally = false;

        }
    }

    /**
     * Først tjekkes der om Ball rammer toppen af spillet.
     * Hvis, bolden ikke har skiftet verticalitet, skiftes dette og ændre goTroughPaddel til true(Dette sættes automatisk tilbage til false, når Ball
     * kommer over 300 på x-aksen. Dette defineres på linje 65 & 66)
     */
    private void checkBounceOffCeiling()
    {
        if (isTouchingCeiling())
        {
                setRotation(360-getRotation());
                GreenfootSound hit = new GreenfootSound("ding.mp3"); //Det tilføjes lyd til Ball, når den hopper rammer taget.
                hit.play();
        }
    }

    /**
     * Check to see if the ball should be restarted.
     * If touching the floor the ball is restarted in initial position and speed.
     */
    private void checkRestart()
    {
        if (isTouchingFloor())
        {
            init();
            //setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        
   
            Greenfoot.setWorld(new GameLost());
        
        
        
           
        }
    }

    /**
     * Bounces the ball back from a vertical surface.
     */
    private void revertHorizontally()
    {
        int randomness = Greenfoot.getRandomNumber(BOUNCE_DEVIANCE_MAX)- BOUNCE_DEVIANCE_MAX / 2;
        setRotation((180 - getRotation()+ randomness + 360) % 360);
        hasBouncedHorizontally = true;
    }

    /**
     * Initialize the ball settings.
     */
    private void init()
    {
        speed = 2;
        delay = DELAY_TIME;
        hasBouncedHorizontally = false;
        hasBouncedVertically = false;
        setRotation(Greenfoot.getRandomNumber(STARTING_ANGLE_WIDTH)+STARTING_ANGLE_WIDTH/2);
        gameManager.resetGameLevel();
    }
    
    private void increaseSpeed(){
        if(gameManager.getPaddleHits() >= 10){
            speed ++;    
            gameManager.resetPaddleHits();
            gameManager.addLevel();
        }
        
    }
}
