import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    protected int health;
    protected static boolean phase_one = true;
    protected static boolean phase_two = false;
    private GreenfootImage boss_core;
    protected GreenfootImage boss_arm;
    protected GreenfootImage boss_eye;
    protected static int attacksOnScreen = 0;
    public boss_arm arm1;
    public boss_arm arm2;
    
    public Boss() {
        health = 3;
    }
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) > 98) {     //attack about 2% of the time
            this.attack();
        }
        if(this.health <= 0) {
            Greenfoot.stop();
        }
    }
    public int get_health() {
        return health;
    }
    public boolean in_phase_one() {
        return phase_one;
    }
    public boolean in_phase_two() {
        return phase_two;
    }
    protected void attack() {
        
        
    }             //calls attack methods on all arms of the boss    
   
    public void hit() {          //To be called from eye destruction
        this.health--;
    }
     public void checkCollisions(){
         if (in_phase_one()) {
        Actor b = getOneIntersectingObject(Boss_attack.class);
        if (b != null && Boss_attack.friendly){
            this.hit();
        }
       }
    }
}
