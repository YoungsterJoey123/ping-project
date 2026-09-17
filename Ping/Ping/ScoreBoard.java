import greenfoot.*;


/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    private GameManager gameManager;
    /**
     * Constructor for objects of class ScoreBoard
     */
    public ScoreBoard(GameManager gameManager)
    {
        this.gameManager = gameManager;
    }

    public void act(){
        updateScoreBoard();
    }
    
    /*
     * her bliver string text til ais score og player score ved at få fat i score fra gameManager og giver dem farven sort
     */
    public void updateScoreBoard(){
        String text = 
        "AI:" + gameManager.getAIScore() +  "\nPlayer: " + gameManager.getPlayerScore();
        GreenfootImage image = new GreenfootImage(text,18,Color.BLACK,new Color(0,0,0,0));
        setImage(image);
    }
    
}
