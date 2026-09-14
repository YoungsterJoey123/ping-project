import greenfoot.*;


/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard  
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
   
    public void updateScoreBoard(){
        String text =  
            "Game Level" + gameManager.getGameLevel();
        GreenfootImage image = new GreenfootImage(text,18,Color.BLACK, new Color(0,0,0,0));
        setImage(image);
    }
    
}
