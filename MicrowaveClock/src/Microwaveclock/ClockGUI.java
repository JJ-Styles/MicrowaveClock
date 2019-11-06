/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microwaveclock;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author t7047098
 */
public class ClockGUI extends JPanel implements ActionListener
{
    private Clock guiClock;
    private JTextField h,m,s;
    private JLabel sep1,sep2;
    private JButton tick;
    private Integer hr, min, sec;
    private Calendar gregCal = new GregorianCalendar();
    
    public ClockGUI() 
    {
        guiClock = new Clock();
        hr = guiClock.getHour();
        min = guiClock.getMinute();
        sec = guiClock.getSecond();
        h = new JTextField(hr.toString(),2);
        m = new JTextField(min.toString(),2);
        s = new JTextField(sec.toString(),2);  
        sep1 = new JLabel(":");
        sep2 = new JLabel(":");
        tick = new JButton("Tick");
        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        card1.add(h);
        card1.add(sep1);
        card1.add(m);
        card1.add(sep2);
        card1.add(s);
        card2.add(tick);
        this.setLayout(new GridLayout(2,1));
        this.add(card1);
        this.add(card2,1);
        tick.addActionListener( this);
        Timer t = new Timer(100, this);
        t.addActionListener(this);
        t.start();      
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        guiClock.tick();
//        System.out.println(guiClock.toString());
        hr = guiClock.getHour();
        min = guiClock.getMinute();
        sec = gregCal.get(Calendar.SECOND);
        h.setText(hr.toString());
        m.setText(min.toString());
        s.setText(sec.toString());
        
    }
   
}
