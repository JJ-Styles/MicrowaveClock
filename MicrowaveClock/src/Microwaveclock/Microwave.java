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
public class Microwave 
{
    private Clock theClock;
    private int maxPower, currentPower;

    public Microwave() 
    {
        maxPower = 500;
        currentPower = 500;
        theClock = new Clock();
    }

    public Microwave(Clock theClock, int maxPower) {
        this.theClock = theClock;
        this.maxPower = maxPower;
        this.currentPower = maxPower;
    }    

    public String getTime() {
        return theClock.toString();
    }

    public int getMaxPower() {
        return maxPower;
    }

    public int getCurrentPower() {
        return currentPower;
    }
    
    public void cook(int p, int t)
    {
        if (p <= maxPower) 
        {
            currentPower = p;
            theClock.tick();
        }
    }
}
