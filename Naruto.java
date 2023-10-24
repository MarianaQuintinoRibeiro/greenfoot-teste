import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Naruto here.
 * 
 * @author (Mariana Quintino Ribeiro) 
 * @version (a version number or a date)
 */
public class Naruto extends Actor
{  
    GifImage myGif = new GifImage("naruto.gif");
    GreenfootSound rasengan = new GreenfootSound("Rasengan.mp3");
    
    private int sTimer = 0;
    public int speed = 5;
    /**
     * Act - do whatever the Naruto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento();// Add your action code here.
    }
    
    public void movimento(){
        
        if (Greenfoot.isKeyDown("w")) {
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")) {
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")) {
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("f") && (sTimer == 0)) {
            sTimer ++;
            rasengan.play();
            getWorld().addObject(new rasengan(),getX() +15, getY()-10);
        }
         else{
            if (!Greenfoot.isKeyDown("f")){
                sTimer = 0;
            }
        }
        }
    }


