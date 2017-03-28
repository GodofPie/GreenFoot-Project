import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FightWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightWorld extends World
{

    /**
     * Builds a FightWorld object.
     * 
     */
    public FightWorld()
    {    
        super(600, 400, 1);
        Fighter fighter = new Fighter();
        Gate gate1 = new Gate();
        Gate gate2 = new Gate();
        Gate gate3 = new Gate();
        addObject(fighter, 50, 350);
        addObject(gate1, 550, 350);
        addObject(gate2, 50, 50);
        addObject(gate3, 550, 50);
        
        
    }
    
    /**
     *  
     */
    public void act() {
        
    }
}
