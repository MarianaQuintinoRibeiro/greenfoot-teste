import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act() {
        //Dialogo Naruto
        if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            setBackground(new GreenfootImage("Naruto.png"));
            atraso++;
        }
        else{
            if (!Greenfoot.isKeyDown("enter")){
                atraso = 0;
            }
        }
        
        //Dialogo Sasuke
        if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            setBackground(new GreenfootImage("Sasuke.png"));
            atraso++;
        }
        else {
             if (!Greenfoot.isKeyDown("enter")){
                atraso = 0;
            }
        }
        
        //Iniciar Jogo
        if (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            folha world = new folha();
            Greenfoot.setWorld(world);
        }
        else {
            if (!Greenfoot.isKeyDown("enter")){
                atraso = 0;
            }
        }
        }
    }

