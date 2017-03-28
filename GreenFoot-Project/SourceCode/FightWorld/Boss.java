import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    int health;
    boolean phase_one;
    boolean phase_two;
    GreenfootImage boss_core;
    GreenfootImage boss_arm;
    GreenfootImage boss_eye;
    
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    private void attack() {}        //calls attack methods on all arms of the boss
    
    public void get_hit() {}        //To be called from eye subcless on hit to take down main boss health uniformly
}
