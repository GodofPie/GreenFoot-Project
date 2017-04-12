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

    public boss_arm(int a) {
        type = a;
    }
    protected void attack() {       //do attaack whenever boss.attack is called
        //this.getWorld().addObject(new Boss_attack(),this.getX(),this.getY());
    }
    protected void flip(){
        getImage().mirrorHorizontally();
    }
}
