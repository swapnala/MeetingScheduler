import pojo.Person;
import pojo.TimeSlot;

import java.sql.Time;
import java.util.ArrayList;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: HP
 * Date: 18 Jul, 2014
 * Time: 7:46:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class MeetingScheduler {
    public void sortTimeSlots(){

    }

    public void calculateAvailableMeetingTimeSlots(Meeting meeting, List<Person> personList){
        List<TimeSlot> busyTS= new ArrayList<TimeSlot>();
        List<Time> standard=new ArrayList<Time>();
        for(Person p:personList){
            busyTS.addAll(p.getBusyTimeSlot());
        }
        Time tempTime= busyTS.get(0).getBeginTime();
        for(int i=1;i<busyTS.size();i++){

            if(tempTime.after(busyTS.get(i).getBeginTime())){
                  tempTime= busyTS.get(i).getBeginTime();
            }
        }
        Collections
    }
}
