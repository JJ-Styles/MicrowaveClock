/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microwaveclock;

import javax.swing.JFrame;

/**
 *
 * @author t7047098
 */
public class clockTest 
{
    public static void main(String[] args) 
    {
        ClockGUI myClock = new ClockGUI();  
        JFrame thisFrame = new JFrame();
        thisFrame.add(myClock);
        thisFrame.pack();
        thisFrame.setVisible(true);
        thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
