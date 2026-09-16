import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AiWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AiWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    private GameManager gameManager;
    private ScoreBoard scoreBoard;
    /**
     * Constructor for objects of class AiWorld.
     * 
     */
    public AiWorld(boolean gameStarted)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        gameManager = new GameManager();
        ScoreBoard scoreBoard = new ScoreBoard(gameManager);
        if (gameStarted)
        {
            setBackground("f1 bane.jpg");
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            addObject(scoreBoard, 70, 50);
            addObject(new Ball(40,40,gameManager), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            addObject(new Paddle(100,60), 60, WORLD_HEIGHT - 50);
            addObject(new AIPaddle(100,30), 60, 50);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
    
    public void act(){
        checkWin();
        checkLose();
    }
    
    public void checkWin(){
        if(gameManager.getPlayerScore() >= 5){
            Greenfoot.setWorld(new GameWon());
        }
    }
    
    public void checkLose(){
        if(gameManager.getAIScore() >= 5){
            Greenfoot.setWorld(new GameLost());
        }
    }
}
