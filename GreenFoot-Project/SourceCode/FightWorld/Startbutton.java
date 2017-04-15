import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startbutton extends Actor
{
    /**
     * Act - do whatever the Startbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo pointer = Greenfoot.getMouseInfo();
        if(this.equals(pointer.getActor())) {
            Greenfoot.setWorld(new FightWorld());
        }
    }    
}
