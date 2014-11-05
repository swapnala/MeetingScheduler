import pojo.Person;
import pojo.TimeSlot;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.*;

import static java.util.Collection.*;

/**
 * Created by IntelliJ IDEA.
 * User: HP
 * Date: 7 Jul, 2014
 * Time: 4:33:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Console {

    public static void main(String[] args){
        Console console=new Console();
        List <Person> personList=console.acceptInput();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Meeting Duration:");
        int duration=Integer.parseInt(scanner.nextLine());
        List<TimeSlot> availableDuration=calculateAvailableSlots(duration,personList);

    }

    private static List<TimeSlot> calculateAvailableSlots(int duration, List<Person> personList) {
        List<TimeSlot> busyTS= new ArrayList<TimeSlot>();
        List<Time> standard=new ArrayList<Time>();
        for(Person p:personList){
            busyTS.addAll(p.getBusyTimeSlot());
            /*for(TimeSlot ts:p.getBusyTimeSlot()){

            }*/
        }
        

        List<Time> timeArray=new ArrayList<Time>();
        timeArray.add(Time.valueOf("00:00:00"));

        for(TimeSlot ts:busyTS){
        timeArray.add(ts.getBeginTime());
            timeArray.add(ts.getEndTime());
          }
        timeArray.add(Time.valueOf("23:00:00"));
        int i=0;
       while(i!=timeArray.size()-1){
                                         System.out.println(timeArray.get(i)+ "-" +timeArray.get(i+1));
           i=i+2;
       }
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public List<Person> acceptInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("No. of people:");
        int noOfPeople=Integer.parseInt(scanner.nextLine());

        int noOfBusySlots;
        List <Person> personList=new ArrayList<Person>();
        HashMap <Person, List<TimeSlot>> map =new HashMap<Person,List<TimeSlot>>();
        for(int i=0;i<noOfPeople;i++){
            Person person=new Person();
            System.out.println("Enter EmpCode:");
            String empCose=scanner.nextLine();
            person.setEmpCode(empCose);
            System.out.println("No. of budy slots:");
            noOfBusySlots=Integer.parseInt(scanner.nextLine());
            for(int slot=0;i<noOfBusySlots;i++){
                TimeSlot timeSlot=new TimeSlot();
                System.out.println("Enter Starttime: 24 hour clock");
                timeSlot.setBeginTime(Time.valueOf(scanner.nextLine()));
                System.out.println("Enter endtime: 24 hour clock");
                timeSlot.setEndTime(Time.valueOf(scanner.nextLine()));
                person.addTimeSlot(timeSlot);
            }
            //Collections.sort(person.getBusyTimeSlot());
            personList.add(person);
        }
        return personList;
    }

    public void printResult(List<Person> personList){
        for(Person p:personList){
             System.out.println(p.getEmpCode());
            for(TimeSlot ts:p.getBusyTimeSlot()){
                System.out.println(ts.getBeginTime());
                System.out.println(ts.getEndTime());
            }
        }
    }
}
