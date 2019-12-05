package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student anila = new Student("Anila");
        Student andira = new Student("Andira");
        Student mahira = new Student("Mahira");
        Student vajra = new Student("Vajra");
        Student kumbhira = new Student("Kumbhira");
        anila.addGrade(85);
        anila.addGrade(90);
        anila.addGrade(91);
        anila.addGrade(93);
        anila.recordAttendance("2018-09-13", "a");
        anila.recordAttendance("2018-09-14", "p");
        anila.recordAttendance("2018-09-15", "p");
        anila.recordAttendance("2018-09-16", "p");
        andira.addGrade(80);
        andira.addGrade(83);
        andira.addGrade(87);
        andira.addGrade(90);
        andira.recordAttendance("2018-09-13", "a");
        andira.recordAttendance("2018-09-14", "a");
        andira.recordAttendance("2018-09-15", "p");
        andira.recordAttendance("2018-09-16", "p");
        mahira.addGrade(95);
        mahira.addGrade(93);
        mahira.addGrade(97);
        mahira.addGrade(100);
        mahira.recordAttendance("2018-09-13", "p");
        mahira.recordAttendance("2018-09-14", "p");
        mahira.recordAttendance("2018-09-15", "p");
        mahira.recordAttendance("2018-09-16", "p");
        vajra.addGrade(75);
        vajra.addGrade(90);
        vajra.addGrade(77);
        vajra.addGrade(88);
        vajra.recordAttendance("2018-09-13", "a");
        vajra.recordAttendance("2018-09-14", "p");
        vajra.recordAttendance("2018-09-15", "a");
        vajra.recordAttendance("2018-09-16", "p");
        kumbhira.addGrade(89);
        kumbhira.addGrade(88);
        kumbhira.addGrade(87);
        kumbhira.addGrade(90);
        kumbhira.recordAttendance("2018-09-13", "p");
        kumbhira.recordAttendance("2018-09-14", "p");
        kumbhira.recordAttendance("2018-09-15", "a");
        kumbhira.recordAttendance("2018-09-16", "p");
        students.put("anilaSheep", anila);
        students.put("andiraMonkey", andira);
        students.put("mahiraRooster", mahira);
        students.put("vajraDog", vajra);
        students.put("kumbhiraBoar", kumbhira);
        int choice;
        String user;
        System.out.println("Welcome to the grade report");
        do{
            System.out.println("\nList of Usernames");
            for(String name : students.keySet()){
                System.out.print(name + "  -- ");
            }
            System.out.println("\nMain Menu");
            System.out.println("1. Display information for chosen username");
            System.out.println("2. Display all student's grades and class average");
            System.out.println("3. Display attendance for chosen username");
            System.out.println("4. Display attendance for all students");
            System.out.println("5. Display CSV resport");
            System.out.println("6. Exit.");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            while(choice < 1 || choice > 6){
                System.out.println("That is not a valid choice; please enter again.");
                choice = scanner.nextInt();
            }
            switch (choice){
                case 1:
                    System.out.println("Enter username");
                    user = scanner.next();
                    if(students.get(user) == null){
                        System.out.println("Username not found.");
                    } else {
                        System.out.println("Name: " + students.get(user).getName());
                        System.out.println("Username: " + user);
                        System.out.print("Grades: ");
                        students.get(user).getGrades();
                        System.out.println("\nAverage: " + students.get(user).getGradeAverage());
                    }
                    break;
                case 2:
                    System.out.println("All students: ");
                    for(String name : students.keySet()){
                        System.out.println("\nName: " + students.get(name).getName());
                        System.out.println("Username: " + name);
                        System.out.print("Grades: ");
                        students.get(name).getGrades();
                        System.out.println("\nAverage: " + students.get(name).getGradeAverage());
                    }
                    break;
                case 3:
                    System.out.println("Enter username: ");
                    user = scanner.next();
                    if(students.get(user) == null){
                        System.out.println("Username not found.");
                    } else {
                        System.out.println("Name: " + students.get(user).getName());
                        System.out.println("Username: " + user);
                        System.out.print("Attendance: ");
                        System.out.println(students.get(user).attendPercent() + "%");
                        System.out.println("Dates: ");
                        students.get(user).getDates();
                    }
                    break;
                case 4:
                    System.out.println("All students: ");
                    for(String name : students.keySet()){
                        System.out.println("\nName: " + students.get(name).getName());
                        System.out.print("Attendance: ");
                        System.out.println(students.get(name).attendPercent() + "%");
                        System.out.println("Dates: ");
                        students.get(name).getDates();
                    }
                    break;
                case 5:
                    System.out.println("Name, Username, Average, Attendance");
                    for(String name : students.keySet()){
                        System.out.println(students.get(name).getName() + ", "
                        + name + ", " + students.get(name).getGradeAverage() + ", "
                                + students.get(name).attendPercent() + "%");

                    }
                    break;
            }
        }while (choice != 6);
        System.out.println("Goodbye");

    }
}
