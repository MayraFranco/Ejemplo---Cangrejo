import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.move(4);//mueve
        /***gira***/
        if(Greenfoot.isKeyDown("right"))//si se presiono alguna tecla 
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            //sonido de comer
            //todos los sonidos  van en la carpeta de sounds
            Greenfoot.playSound("eating.wav");
        }
    }    
}
