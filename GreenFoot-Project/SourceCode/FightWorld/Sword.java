import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sword extends Actor
{
    /**
     * Act - do whatever the Sword wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 boolean hasAttacked;
 int START_ROT;
 public boolean flipped = false;
 static boolean attacking = false;
 static int damage = 2;
    public void addedToWorld() 
    {
     hasAttacked = false;
     START_ROT = getRotation(); 
}
private boolean justAttacked = false;   
    public void act() 
    {
  
        checkInput();
        checkAttack();
        
    } 
    public void checkInput(){
        
        if (Greenfoot.isKeyDown("a")) 
        {
            reset();
            move(-3);
        }
        if (Greenfoot.isKeyDown("d")) 
        {
            reset();
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
    public void checkAttack(){
         if (Greenfoot.isKeyDown("space") && !justAttacked) {
          checkRotation();
          checkPosition();
          attacking = true;
          justAttacked = true;
        } else if (!Greenfoot.isKeyDown("space") && justAttacked) {
            reset();
            justAttacked = false;
            attacking = false;
        }
    }
    public void reset() {
        setRotation(START_ROT);
        setImage("sword90Up.png");
        if (Fighter.facingScreenRight) {
            setLocation(Fighter.X + 5, Fighter.Y - 15);
           checkAlignment();
        } else if(!Fighter.facingScreenRight) {
             setLocation(Fighter.X - 9, Fighter.Y - 17);
             checkAlignment();
        }
    }
    public void checkAlignment() {
        if(Fighter.facingScreenRight) {
            getImage().mirrorHorizontally();
            flipped = false;
        } else if(!Fighter.facingScreenRight && !flipped){
            getImage().mirrorHorizontally();
            setLocation(getX() - 7, getY() + 10);
                flipped = true;    
        }
    }
    public void checkRotation() { //checks the rotation based on which way the hero is facing
        if(Fighter.facingScreenRight) {
             int oldRotation = getRotation();
            int newRotation = oldRotation + 45;
            setImage("swipe.png");
            checkAlignment();
            setRotation(newRotation);
        
        } else if(!Fighter.facingScreenRight){
                int oldRotation = getRotation();
            int newRotation = oldRotation - 45;
            setImage("swipe.png");
            checkAlignment();
            setRotation(newRotation);
        }
    }
    public void checkPosition() {
     if(Fighter.facingScreenRight) {
           setLocation(getX() + 2 , Fighter.Y + 7);
        
        } else if(!Fighter.facingScreenRight){
                setLocation(getX(), Fighter.Y + 3);
        }
        
    }
    
    public boolean isAttacking() {
        return attacking;
    }
}
