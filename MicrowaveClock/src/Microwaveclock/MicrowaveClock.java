/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microwaveclock;

/**
 *
 * @author t7047098
 */
public class MicrowaveClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Clock c = new Clock(14, 30,30); 
        Microwave m = new Microwave(c, 750); 
        System.out.println("The microwave is currently at "  + m.getCurrentPower() + " watts and "+ m.getTime()); 
        m.cook(600,45); // should advance time to  14:31:15 
        System.out.println(m.getTime()); 
        m.cook(800,45);// shoudln't cook as power > maxPower 
        System.out.println(m.getTime()); 
    }
    
}
