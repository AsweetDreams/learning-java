/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author khai
 */

public class Timetable {
    public static String getJob(WeekDay dayInWeek){
        if(dayInWeek == WeekDay.SATERDAY || dayInWeek == WeekDay.SUNDAY){
            return "nothing";
        }
        return "coding";
    }
}
