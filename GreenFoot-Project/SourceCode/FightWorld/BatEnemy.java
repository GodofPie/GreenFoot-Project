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
    private boolean dead = false;
    private int destX;
    private int destY;
    private int prevX;
    private int prevY;
    private boolean atDest = false;
    private int animator = 0;
    private GreenfootImage[] images = {new GreenfootImage("bat1.png"), new GreenfootImage("bat2.png"),new GreenfootImage("bat3.png")};
    public void addedToWorld(World world) {
        for(int i = 0; i < images.length; i++){
            images[i].scale(images[i].getWidth() / 2, images[i].getHeight() / 2);
        }
        setImage(images[animator]); 
    
    }
    public void act() 
    {
       
      //  if (atDest) {    
         destX = getNewX(getWorld().getWidth());
         //if (destX >= prevX || destX <= prevX){
             destX = getNewX(getWorld().getWidth());
          //  }
         destY = getNewY(getWorld().getHeight());
        // if (destY >= prevY || destY <= prevY){
             destY = getNewY(getWorld().getHeight());
           // }
         //atDest = false;
        //} else if (!atDest) {
         move(destX, destY);
        //}
         checkCollisions();
         checkForDeath();
    }
        

    public void move(int x, int y) {
           turnTowards(x, y);
           move(25);
           if (Greenfoot.getRandomNumber(100) < 51){
               turn(15);
            }  
            
            if (animator < 2) {
                animator++;
            } else if (animator == 2) {
                animator = 0;
            }
            animate(animator); 
            if (x == getX() && y == getY()){
                prevX = destX;
                prevY = destY;
                atDest = true;
                dead = true;
            }
    }
    public void scan() {
        
    }
    public void animate(int i) {
        setImage(images[animator]);
    }
    public void checkCollisions(){
        Actor b = getOneIntersectingObject(Sword.class);
        if (b != null && Sword.attacking){
            this.setHealth(Sword.damage);
        }
    }
    public void checkForDeath(){
        if (health <= 0) {
            getWorld().removeObject(this);
        }
    }
    public int getNewX(int end)
    {
        int x = Greenfoot.getRandomNumber(end-100+1);
       while(x >= (getX()-10) && x <= (getX()+10)){
           x = Greenfoot.getRandomNumber(end+1);
         }
         return x;
    }
     public int getNewY(int end)
    {
        int y = Greenfoot.getRandomNumber(end-50+1);
       while(y >= (getY()-10) && y <= (getY()+10)){
           y = Greenfoot.getRandomNumber(end+1);
         }
         return y;
    }
    public int getHealth() {
        return health;
    }
     public void setHealth(int damage) {
        health = health - damage;
    }
}
