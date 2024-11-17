package bailecture10;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class processor {
    private static final SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("dd-MM-yyyy");

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); 
            StudentList studentList = new StudentList(); 
            int choice;
            do{
                System.out.println("Menu:"); 
                System.out.println("1. Enter student information"); 
                System.out.println("2. Display all students"); 
                System.out.println("3. Find student by ID"); 
                System.out.println("4. Delete student by ID"); 
               System.out.println("5. Edit student by ID"); 
               System.out.println("6. Exit"); 
               System.out.print("Enter your choice: "); 
               choice = scanner.nextInt();
               scanner.nextLine();
               switch (choice){
                   case 1: Student student = new Student(); 
                   student.enterStudentInfo(); 
                   studentList.addStudent(student); 
                   break;
                  case 2: studentList.displayAllStudents(); 
                  break; 
                  case 3: System.out.print("Enter student ID: "); 
                  String id = scanner.nextLine(); 
                  Student foundStudent = studentList.findStudentById(id);
                  if (foundStudent != null) { 
                      foundStudent.displayStudentInfo();
                  }else { 
                      System.out.println("Student not found."); 
                  } 
                  break;
                  case 4: System.out.print("Enter student ID: "); 
                  id = scanner.nextLine();
                  if (studentList.deleteStudentById(id)) { 
                      System.out.println("Student deleted successfully.");
                  }else { 
                      System.out.println("Student not found.");
                  }
                  break;
                  case 5:
                      System.out.print("Enter student ID: "); 
                      id = scanner.nextLine(); 
                      Student existingStudent = studentList.findStudentById(id);
                      if (existingStudent != null) { 
                          System.out.println("Enter new information for the student:");
                          Student updatedStudent=new Student();
                          updatedStudent.enterStudentInfo();
                          if(studentList.editStudentById(id, updatedStudent)){
                              System.out.println("Student updated succeccfully");
                        }else {
                              System.out.println("Error udating student.");
                          }
                      }else{
                               System.out.println("Student not found");
                                  }
                      break;
                  case 6:
                      System.out.println("EXiting.....");
                      break;
                  default:
                      System.out.println("Invalid choice.please try again.");
               }
               
            } while(choice !=6);
        scanner.close();
    }
    
}
