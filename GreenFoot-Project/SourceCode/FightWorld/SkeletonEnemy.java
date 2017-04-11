import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TopLeftBoat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkeletonEnemy extends Enemy
{   private int destX;
    private int destY;
    private int prevX;
    private int prevY;
    private int damage = 1;
    private int health = 1;

    /**
     * Act - do whatever the TopLeftBoat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
         //move();
         checkCollisions();
         checkForDeath();
        
    }  
    
    public void checkForDeath(){
        if (health <= 0) {
           // Actor me = getOneObjectAtOffset(0, 0, TopLeftBoat.class);
            getWorld().removeObject(this);
           // Gate.enemiesKilled++;
           
        }
    }
    public void checkCollisions(){
        Actor b = getOneIntersectingObject(Sword.class);
        if (b != null && Sword.attacking){
            this.setHealth(Sword.damage);
        }
    } 
    public int getHealth() {
        return health;
    }
     public void setHealth(int damage) {
        health = health - damage;
    }
}
