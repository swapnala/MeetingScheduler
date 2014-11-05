package pojo;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: HP
 * Date: 7 Jul, 2014
 * Time: 4:28:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeSlot {
    Time beginTime;
    Time endTime;

    public Time getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Time beginTime) {
        this.beginTime = beginTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
