import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fighter extends Actor {

static int peopleOnScreen = 1;
static boolean facingScreenRight = true;
static int X;
static int Y;
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health;
    
    public Fighter() {
        health = 10;
    }
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
        checkCollisions();
        checkForDeath();
        
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
    public void hit() {
        health--;
    }
     public void checkCollisions(){
        Actor b = getOneIntersectingObject(Enemy.class);
        Actor c = getOneIntersectingObject(Boss.class);
        if (b != null && !Sword.attacking){
            this.hit();
        } else if (c != null && !Sword.attacking) {
            this.hit();
        }
    }
  
    public void checkForDeath(){
        if (health <= 0) {
            java.util.List swordlist = getObjectsInRange(100, Sword.class);
            getWorld().removeObject( (Actor) swordlist.get(0));
            getWorld().removeObject(this);
            peopleOnScreen --;
        }
    }
}
