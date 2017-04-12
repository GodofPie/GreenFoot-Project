import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CatepillarEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatepillarEnemy extends Enemy
{
    private int health = 10;
    private int rotationalSpeed = 1;
    private int radius = 150; // adjust as needed
    private boolean atCenter;
    
    /**
     * Act - do whatever the CatepillarEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World world) {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 4, image.getHeight() /4);
        setImage(image);
    }
    public void act() 
    {
         checkCollisions();
          checkForDeath();
          move();
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
 
  public void move()  
  { 
      if(atCenter) {
          setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
          turn(rotationalSpeed-90);
          move(radius);
          turn(90);
        } else {
            move(5);
            if (getX() == getWorld().getWidth()/2){
                atCenter = true;
            }
        }
    }
}

