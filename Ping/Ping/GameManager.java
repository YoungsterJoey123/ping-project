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
    
    
}
