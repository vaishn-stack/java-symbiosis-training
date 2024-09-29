/*accept employees date of joining and get his date of retirement as per the company p
 policy 58 is the retirement age
 */

 import java.time.LocalDate;
 import java.time.format.DateTimeFormatter;
 import java.util.Scanner;
 
 public class retirement {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
 
         System.out.print("Enter the date of joining (YYYY-MM-DD):");
         String joiningDateStr = scanner.nextLine();
         LocalDate joiningDate = LocalDate.parse(joiningDateStr, formatter);
 
         LocalDate retirementDate = calculateRetirementDate(joiningDate);
         System.out.println("The date of retirement is: " + retirementDate.format(formatter));
     }
 
     public static LocalDate calculateRetirementDate(LocalDate joiningDate) {
         return joiningDate.plusYears(58);
     }
 }
 
