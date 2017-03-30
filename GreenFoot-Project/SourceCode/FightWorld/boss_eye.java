import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss_eye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss_eye extends Boss
{
    private int health = 5;
    /**
     * Act - do whatever the boss_eye wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor sword = getOneIntersectingObject(Sword.class);
        if(this.isTouching(Sword.class) && Sword.attacking) {
            this.health--;
            if(health == 0) {
                super.hit();
                getWorld().removeObject(this);
            }
        }
    }    
}
