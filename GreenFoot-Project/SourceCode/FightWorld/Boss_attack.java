import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss_attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss_attack extends Actor
{
    /**
     * Act - do whatever the Boss_attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int target_x = -1;
    private int target_y = -1;
    public void act() 
    {
        if(target_x == -1 && target_y == -1) {                                      //If target isn't known, get coordinates
            Actor target = this.getNeighbours(1000,true,Fighter.class).get(0);      //There's probably a better way to do this, but there's only one fighter so
            target_x = target.getX();
            target_y = target.getY();
            turnTowards(target_x,target_y);
        } else {
            move(5);
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}
