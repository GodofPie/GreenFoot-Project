import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titleworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titleworld extends World
{
    /**
     * Constructor for objects of class Titleworld.
     * 
     */
    public Titleworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Menu_logo(), 300, 69);
        addObject(new Menu_text(), 299, 153);
    }
}
