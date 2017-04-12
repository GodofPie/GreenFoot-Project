import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss_arm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss_arm extends Boss
{
private int type = 0; // a 1 means an attacking arm, -1 means a decrotive one
    public void act() {       //do attaack whenever boss.attack is called
       if(Boss.phase_one && Boss.attacksOnScreen < 3){
        Boss_attack attack = new Boss_attack();
        getWorld().addObject(attack, getX(), getY());
        Boss.attacksOnScreen++;
    }
       
    }
    protected void flip(){
        getImage().mirrorHorizontally();
    }
}
