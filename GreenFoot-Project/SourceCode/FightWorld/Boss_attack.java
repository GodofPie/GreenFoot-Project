import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss_attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss_attack extends Boss
{
    public static boolean friendly = true;
    private int targetX = 0;
    private int targetY = 0;
    private boolean heroFound = false;
    
    public void addedToWorld() {
        if (!friendly) {
            friendly = true;
        }
        java.util.List fighterlist = getObjectsInRange(600, Fighter.class);
        Actor fighter =(Actor) fighterlist.get(0);
        targetX = fighter.getX();
        targetY = fighter.getY();
        turnTowards(targetX, targetY);
        
    }
    public void act() 
    {
        if (!heroFound) {
        java.util.List fighterlist = getObjectsInRange(600, Fighter.class);
        Actor fighter =(Actor) fighterlist.get(0);
        targetX = fighter.getX();
        targetY = fighter.getY();
        turnTowards(targetX, targetY);
        heroFound = true;
        }
        move(5);
        checkCollisions();
    }
    public boolean getFriendly() {
        return friendly;
    }
     public void checkCollisions(){
        Actor b = getOneIntersectingObject(Sword.class);
        Actor c = getOneIntersectingObject(Fighter.class);
        if (b != null && Sword.attacking){
        java.util.List bosslist = getObjectsInRange(600, Boss.class);
        Actor boss =(Actor) bosslist.get(0);
        targetX = boss.getX();
        targetY = boss.getY();
        turnTowards(targetX, targetY);
        } else if (c != null) {
            getWorld().removeObject(this);
            Boss.attacksOnScreen--;
        } else if (isAtEdge()) {
            getWorld().removeObject(this);
            Boss.attacksOnScreen--;
        }
    }
}
