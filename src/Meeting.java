import pojo.Person;
import pojo.TimeSlot;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: HP
 * Date: 7 Jul, 2014
 * Time: 4:31:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meeting {
      List<TimeSlot> availableTimeSlot;
      double meetingDuration;

    public List<TimeSlot> getAvailableTimeSlot() {
        return availableTimeSlot;
    }

    public void setAvailableTimeSlot(List<TimeSlot> availableTimeSlot) {
        this.availableTimeSlot = availableTimeSlot;
    }

    public double getMeetingDuration() {
        return meetingDuration;
    }

    public void setMeetingDuration(double meetingDuration) {
        this.meetingDuration = meetingDuration;
    }
}
