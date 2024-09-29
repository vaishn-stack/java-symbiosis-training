/* java program create a hashtable or student data like (rollno,dateofbirth)
studentname and course enrolled where rollno is the key will be hashtable and 
print the hashtable. 
 */

import java.util.Hashtable;
import java.util.Scanner;
class Student {
    private String dateOfBirth;
    private String name;
    private String course;

    public Student(String dateOfBirth, String name, String course) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Date of Birth: " + dateOfBirth + ", Course: " + course;
    }
}
public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer, Student> students = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter date of birth (YYYY-MM-DD):");
            String dateOfBirth = sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter course enrolled: ");
            String course = sc.nextLine();

            students.put(rollNo, new Student(dateOfBirth, name, course));
        }
        System.out.println("\nStudent Data in Hashtable:");
        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo + ", " + students.get(rollNo));
        }
           sc.close();
    }
}

