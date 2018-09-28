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
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,464,321);
        Crab crab = new Crab();
        addObject(crab,173,310);
        Worm worm = new Worm();
        addObject(worm,319,191);
        Worm worm2 = new Worm();
        addObject(worm2,379,543);
        Worm worm3 = new Worm();
        addObject(worm3,350,296);
        Worm worm4 = new Worm();
        addObject(worm4,513,103);
        Worm worm5 = new Worm();
        addObject(worm5,361,122);
        Worm worm6 = new Worm();
        addObject(worm6,206,186);
        Worm worm7 = new Worm();
        addObject(worm7,135,54);
        Worm worm8 = new Worm();
        addObject(worm8,76,235);
        Worm worm9 = new Worm();
        addObject(worm9,107,363);
        Worm worm10 = new Worm();
        addObject(worm10,208,403);
        Worm worm11 = new Worm();
        addObject(worm11,220,482);
    }
}
