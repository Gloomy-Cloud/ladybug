import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mazerunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mazerunner extends Players
{
    /**
     * Act - do whatever the mazerunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public mazerunner()
    {
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    }
    public void act()
    {
        slideAround();
        collectBoost();
        maxSpeed();
        mazerunnerHit();
        youWin();
    }
    public void mazerunnerHit()
    {
        if(hitEnemy())
        {
            setLocation(15,453);
        }
    }
}
