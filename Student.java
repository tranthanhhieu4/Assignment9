package bailecture10;
import java.util.Scanner;  
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Student {
    String id;
    String fullName;
    String major;
    double gpa;
    Date dateOfBirth;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Student() {}
    Student(String id, String fullName, String dateOfBirth, String major, double gpa) {
        this.id = id;
        this.fullName = fullName;
        try {
            this.dateOfBirth = dateFormat.parse(dateOfBirth);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        this.major = major;
        this.gpa = gpa;
    }
        public void enterStudentInfo() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student ID:"); 
            this.id = scanner.nextLine();
            System.out.println("Enter student full name:"); 
            this.fullName = scanner.nextLine();
            System.out.println("Enter student date of birth (dd-MM-yyyy):"); 
            String dob = scanner.nextLine();
            try {
                this.dateOfBirth = dateFormat.parse(dob);
        }catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date as dd-MM-yyyy."); 
            return;
        }
            System.out.println("Enter student major:"); 
            this.major = scanner.nextLine(); 
            System.out.println("Enter student GPA:"); 
            this.gpa = scanner.nextDouble();
            scanner.nextLine();
    }
        public void displayStudentInfo() { 
        System.out.println("Student ID: " + this.id); 
        System.out.println("Student Full Name: " + this.fullName);
        System.out.println("Date of Birth: " + dateFormat.format(this.dateOfBirth)); // 
        System.out.println("Major: " + this.major); 
        System.out.println("GPA: " + this.gpa); 
        }
    }
