import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sasuke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sasuke extends Actor
{
    GifImage myGif = new GifImage("sasuke.gif");
    GreenfootSound chidori = new GreenfootSound("Chidori.mp3");
    
    private int sTimer = 0;
    public int speed = 3;
    /**
     * Act - do whatever the Sasuke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento();// Add your action code here.
    }
    
    public void movimento(){
        
        if (Greenfoot.isKeyDown("up")) {
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")) {
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX() - speed, this.getY());
        }
              if (Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("space") && (sTimer == 0)) {
            sTimer ++;
            chidori.play();
            getWorld().addObject(new chidori(),getX() +15, getY()-10);
        }
         else{
            if (!Greenfoot.isKeyDown("space")){
                sTimer = 0;
            }
        }
    }
}
