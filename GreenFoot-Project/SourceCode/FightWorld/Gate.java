import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gate extends Actor
{
    /**
     * Act - do whatever the Gate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int enemiesKilled = 0;
   //private boolean bossSpawned = false;
     public void addedToWorld(World world) {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }
    public void act() 
    {
       if (enemiesKilled == 3) {
           Boss boss = new Boss();
           getWorld().addObject(boss, this.getX(), this.getY());
            boss_arm arm1 = new boss_arm(1);
            boss_arm decarm1 = new boss_arm(-1);
            boss_arm decarm2 = new boss_arm(-1);
            boss_arm arm2 = new boss_arm(1);
            arm2.flip();
           getWorld().addObject(arm1, this.getX() - 60, this.getY() - 80);
           getWorld().addObject(arm2, this.getX() + 60, this.getY() - 80);
           //bossSpawned = true;
           getWorld().removeObject(this);
        }
    }    
}
