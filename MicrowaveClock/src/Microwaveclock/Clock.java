/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microwaveclock;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author t7047098
 */
public class Clock 
{
    private int hour, minute, second;
    private Calendar gregCal = new GregorianCalendar();
    
    public Clock() 
    {
        hour = gregCal.get(Calendar.HOUR_OF_DAY);
        minute = gregCal.get(Calendar.MINUTE);
        second = gregCal.get(Calendar.SECOND);
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    @Override
    public String toString()
    {
      return "The Time is " + hour + ":" + minute + ":" + second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void tick()
    {
        second ++;
        if (second == 60) 
        {
            minute ++;
            second = 0;
            if (minute == 60) 
            {
                hour ++;
                minute = 0;
                if (hour == 24) 
                {
                    hour = 0;
                }
            }
        }
//        setHour(gregCal.get(Calendar.HOUR_OF_DAY));
//        setMinute(gregCal.get(Calendar.MINUTE));
//        setSecond(gregCal.get(Calendar.SECOND));
//        System.out.println(toString());
    }
}
