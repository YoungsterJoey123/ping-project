import greenfoot.*;


/**
 * The Ping World is where Balls and Paddles meet to play pong.
 * 
 * @author The teachers 
 * @version 1
 */
public class PingWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    private GameManager gameManager;
    private ScoreBoard scoreBoard;
    /**
     * Constructor for objects of class PingWorld.
     */
    public PingWorld(boolean gameStarted)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        gameManager = new GameManager();
        scoreBoard = new ScoreBoard(gameManager);
        if (gameStarted)
        {
            setBackground("f1 bane.jpg");
            GreenfootImage background = getBackground();
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            addObject(new Ball(40,40,gameManager), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            addObject(new Paddle(100,60), 60, WORLD_HEIGHT - 50);
            addObject(new PaddleTwo(100,40), 60, Greenfoot.getRandomNumber(200) + 100);
            addObject(scoreBoard, 50,50);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
    

}
