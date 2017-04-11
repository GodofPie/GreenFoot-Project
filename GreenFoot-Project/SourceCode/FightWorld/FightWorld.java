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
        BatEnemy bat = new BatEnemy();
        CatepillarEnemy cat = new CatepillarEnemy();
        SkeletonEnemy skel = new SkeletonEnemy();
        addObject(fighter, 50, 350);
        addObject(bat, 550, 350);
        addObject(cat, 50, 50);
        addObject(skel, 550, 50);
        addObject(gate1, 300, 200);
        
        
        
    }
    
    /**
     *  
     */
    public void act() {
        
    }
}
