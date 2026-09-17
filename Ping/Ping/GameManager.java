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
    private int playerScore;
    private int aiScore;

    /**
     * Constructor for objects of class GameManager
     */
    public GameManager()
    {
    }
    // setter
    public void paddleHits(){
        paddleHit++;
    }
    // getter
    public int getPaddleHits(){
        return paddleHit;
    }
    // resetter
    public void resetPaddleHits(){
        paddleHit = 0;
    }
     // getter
    public int getGameLevel(){
        return gameLevel;
    }
    // setter
    public void addLevel(){
        gameLevel++;
    }
    // resetter
    public void resetGameLevel(){
        gameLevel = 0;
    }
     // getter
    public int getPlayerScore(){
        return playerScore;
    }
     // getter
    public int getAIScore(){
        return aiScore;
    }
    // setter
    public void addPlayerScore(){
        playerScore++;
    }
    // setter
    public void addAIScore(){
        aiScore++;
    }
}
    
    
