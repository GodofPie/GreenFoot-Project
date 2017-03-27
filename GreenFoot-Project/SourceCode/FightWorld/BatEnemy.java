import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BatEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatEnemy extends Enemy
{
    /**
     * Act - do whatever the BatEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int damage = 1;
    static int health = 1;
    private boolean foundHero = false;
    private int animator = 0;
    private GreenfootImage[] images = {new GreenfootImage("bat1.png"), new GreenfootImage("bat2.png"),new GreenfootImage("bat3.png")};
    public void addedToWorld(World world) {
        for(int i = 0; i < images.length; i++){
            images[i].scale(images[i].getWidth() / 6, images[i].getHeight() / 6);
        }
        setImage(images[animator]);
    }
    public void act() 
    {
     
        move();
        //scan();
        checkCollisions();
        checkForDeath();
        
    }  
    public void move() {
            move(10);
            if (Greenfoot.getRandomNumber(100) < 90) {
                turn(Greenfoot.getRandomNumber(90));
            }
            if (animator < 2) {
                animator++;
            } else if (animator == 2) {
                animator = 0;
            }
            animate(animator);   
    }
    public void scan() {
        
    }
    public void animate(int i) {
        setImage(images[animator]);
    }
    public void checkCollisions(){
        Actor b = getOneIntersectingObject(Sword.class);
        if (b != null && Sword.attacking){
            health =- Sword.damage;
        }
    }
    public void checkForDeath(){
        if (health <= 0) {
            getWorld().removeObject(this);
        }
    }
}
