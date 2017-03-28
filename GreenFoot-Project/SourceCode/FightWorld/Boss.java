import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private int health;
    private boolean phase_one;
    private boolean phase_two;
    private GreenfootImage boss_core;
    protected GreenfootImage boss_arm;
    protected GreenfootImage boss_eye;
    
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
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
    private void attack() {}        //calls attack methods on all arms of the boss
    
    protected void get_hit() {}        //To be called from eye subcless on hit to take down main boss health uniformly
}
