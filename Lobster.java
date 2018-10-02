import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class Lobster extends Actor
  {
    //no usar nombres genericos a las variables de instancia!!!!!!!!
    private int pasos;
    
    public Lobster()
    {
        pasos = 0; 
    }
    
     /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        pasos++;
        if(pasos == 5)
        {
            turn(Greenfoot.getRandomNumber(180)-90); 
            //gira en un numero aleatorio de 0 y 179 - 90, entre -90 y 90
            pasos = 0;
        }
        /*
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
        }*/
    }    
}
