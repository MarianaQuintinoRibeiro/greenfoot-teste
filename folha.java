import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class folha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class folha extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("fundo.mp3");
    
    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class folha.
     * 
     */
    public folha()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Naruto naruto = new Naruto();
        addObject(naruto,203,397);
        Sasuke sasuke = new Sasuke();
        addObject(sasuke,540,401);
        Counter counter = new Counter();
        addObject(counter,467,37);
        Counter2 counter2 = new Counter2();
        addObject(counter2,286,36);
    }
}
