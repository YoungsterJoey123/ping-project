/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager  
{
    private int paddleHit;
    private int gameLevel;
    /**
     * Constructor for objects of class GameManager
     */
    public GameManager()
    {
    }

    public void paddleHits(){
        paddleHit++;
    }
    
    public int getPaddleHits(){
        return paddleHit;
    }
    
    public void resetPaddleHits(){
        paddleHit = 0;
    }
    
    public int getGameLevel(){
        return gameLevel;
    }
    
    public void addLevel(){
        gameLevel++;
    }
    
    public void resetGameLevel(){
        gameLevel = 0;
    }
}
