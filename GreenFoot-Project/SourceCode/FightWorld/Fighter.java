import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fighter extends Actor {

static boolean facingScreenRight = true;
static int X;
static int Y;
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public void addedToWorld(World world)
        {
            Sword mySword = new Sword();
            X = getX();
            Y = getY();
            getWorld().addObject(mySword, getX() + 9, getY() - 17);
            
        }
    public void act() 
    {
        checkKeypress();
        X = getX();
        Y = getY();
    }    
    
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("a")) 
        {
            if (facingScreenRight) {
            facingScreenRight = false;
            getImage().mirrorHorizontally();
        }
            move(-3);
        }
        if (Greenfoot.isKeyDown("d")) 
        {
           if (!facingScreenRight) {
            facingScreenRight = true;
            getImage().mirrorHorizontally();
        }
            move(3);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+3);
        }
        
       
    }
  
    
}
