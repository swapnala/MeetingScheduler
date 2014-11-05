package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HP
 * Date: 7 Jul, 2014
 * Time: 4:20:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    String empCode;
    List<TimeSlot> busyTimeSlot;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public void addTimeSlot(TimeSlot timeSlot){
        if(busyTimeSlot==null){
            busyTimeSlot=new ArrayList<TimeSlot>();
        }
        busyTimeSlot.add(timeSlot);

    }

    public List<TimeSlot> getBusyTimeSlot() {
        return busyTimeSlot;
    }

    public void setBusyTimeSlot(List<TimeSlot> busyTimeSlot) {
        this.busyTimeSlot = busyTimeSlot;
    }

    
}
