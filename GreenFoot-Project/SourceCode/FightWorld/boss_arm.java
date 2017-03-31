import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss_arm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss_arm extends Boss
{
    protected void attack() {       //do attaack whenever boss.attack is called
        this.getWorld().addObject(new Boss_attack(),this.getX(),this.getY());
    }
}
