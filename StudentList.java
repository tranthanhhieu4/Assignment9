
package bailecture10;
import java.util.ArrayList; 
import java.util.List;
public class StudentList {
 private List<Student> students; 
 public StudentList() { 
     students = new ArrayList<>();
 }   
 public void addStudent(Student student) { 
     students.add(student);
 }
 public void displayAllStudents() {
     for (Student student : students) { 
         student.displayStudentInfo();
         System.out.println();
     }
 }
 public Student findStudentById(String id) {
    for (Student student : students) {
        if (student.id.equals(id)) {
            return student;
        }
    }
    return null;
 }
 public boolean deleteStudentById(String id) {
     Student student = findStudentById(id);
     if (student != null) {
         students.remove(student);
         return true;
     }
     return false;
 }
 public boolean editStudentById(String id, Student updatedStudent) {
     for (int i = 0; i < students.size(); i++){
         if (students.get(i).id.equals(id)) { 
             students.set(i, updatedStudent);
             return true;
         } 
     }
     return false;
 }
}
