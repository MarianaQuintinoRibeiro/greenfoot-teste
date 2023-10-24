
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rasengan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rasengan extends Actor
{
    GifImage myGif = new GifImage("rasengan.gif");
    
    /**
     * Act - do whatever the rasengan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
        setImage(myGif.getCurrentImage());// Add your action code here.
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
    
    public void acertarAlvo() {
        
        Actor a = getOneIntersectingObject(Sasuke.class);
        
        if (a != null){
            
            Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter2.add(1);
        
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
}