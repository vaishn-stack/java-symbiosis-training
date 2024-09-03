//calculate grades of the students based on the given marks.
    
import java.util.Scanner;

public class student 
{
        public static void main(String[] args)
     {
        float totalSubjects, totalMarks = 0, averageMarks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of subjects: ");
        totalSubjects = sc.nextFloat();

        for (int i = 1; i <= totalSubjects; i++) 
        {
            System.out.println("Enter the marks for subject " + i + ": ");
            totalMarks += sc.nextFloat();
        }

        averageMarks = totalMarks / totalSubjects;

        if (averageMarks >= 80) 
        {
            System.out.println("Average Marks: " + averageMarks + ", Grade A");
        } else if (averageMarks >= 60) 
        {
            System.out.println("Average Marks: " + averageMarks + ", Grade B");
        } else if (averageMarks >= 30) 
        {
            System.out.println("Average Marks: " + averageMarks + ", Grade C");
        } else 
        {
            System.out.println("Average Marks: " + averageMarks + ", Grade D");
        }
    }
}
