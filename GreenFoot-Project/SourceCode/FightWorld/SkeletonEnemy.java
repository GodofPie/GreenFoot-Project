import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TopLeftBoat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkeletonEnemy extends Enemy
{   
    private int damage = 1;
    private int health = 1;
    private int offset = 0;
    private boolean needToGoHorz = true;
    private boolean reverse = false;

    
     public void addedToWorld(World world) {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() * 2, image.getHeight() * 2);
        setImage(image);
    }
    /**
     * Act - do whatever the TopLeftBoat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
         move();
         checkCollisions();
         checkForDeath();
        
    }  
    
    public void checkForDeath(){
        if (health <= 0) {
           // Actor me = getOneObjectAtOffset(0, 0, TopLeftBoat.class);
            getWorld().removeObject(this);
           Gate.enemiesKilled++;
           
        }
    }
    public void checkCollisions(){
        Actor b = getOneIntersectingObject(Sword.class);
        if (b != null && Sword.attacking){
            this.setHealth(Sword.damage);
        }
    } 
    public int getHealth() {
        return health;
    }
     public void setHealth(int damage) {
        health = health - damage;
    }
    public void move () {
        if (offset < 150) {
            if(needToGoHorz) {
                if (getX() > 350) {
                    move(-5);
                    offset += 5;
                } else if (getX() < 550) {
                    while(getX() < 550){
                        move(5);
                        offset += 5;
                  }
                }
            } else {
                if (getY() < 200) {
                    setLocation(getX(), getY() + 5);
                    offset += 5;
                } else if (getY() > 50) {}
           }
        } else if (offset >= 100) {
           needToGoHorz = !needToGoHorz;
           offset = 0;
       }
    }
}
