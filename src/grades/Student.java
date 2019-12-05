package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer>grades;
    private HashMap<String, String>attendance;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
        attendance = new HashMap<>();
    }

    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public void getGrades(){
        for(Integer grade : grades){
            System.out.print(grade + " ");
        }
    }
    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
    public void recordAttendance(String date, String value){
        if(value.equalsIgnoreCase("p") || value.equalsIgnoreCase("a")){
            value = value.toUpperCase();
            attendance.put(date, value);
        } else{
            System.out.println("Not correct value");
        }

    }
    public double attendPercent(){
        double attended = 0;
        for(String attend : attendance.values()){
            if(attend.equals("P")){
                attended += 1;
            }
        }
        return (attended / attendance.size() *100);
    }
    public void getDates(){
        for(String dates : attendance.keySet()){
            System.out.print(dates);
            System.out.println("/" + attendance.get(dates));
        }
    }
}
