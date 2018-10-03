import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int n;
    private Lobster lobster;
    private Crab crab;
    private GreenfootSound musica;
    public CrabWorld(int n)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        this.n=n;
        Tiempo tiempo = new Tiempo();
        addObject(tiempo, 10,5);
        lobster = new Lobster();
        addObject(lobster,464,321);
        crab = new Crab();
        addObject(crab,173,310);
        musica = new GreenfootSound("ufo-t-balt.mp3");
        prepare();
        
    }
    public void started()
     {
        musica.playLoop();
    }
   
    public void stopped()
    {
        musica.pause();
    }
     
    public Lobster accede()
    {   
        return lobster;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //crear gusanos de forma aleatoria
        for(int i =0; i<n; i++)
        {
            Worm wormi = new Worm();
            addObject(wormi, Greenfoot.getRandomNumber(520)+20, 
            Greenfoot.getRandomNumber(520)+20);
        }
     }
}
