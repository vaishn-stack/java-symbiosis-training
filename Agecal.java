/*accept person date of birth & find out the current age */

import java.time.LocalDate;
import java.time.Period;

public class Agecal {
    public static void main(String[] args) 
	{
        LocalDate birthdate = LocalDate.of(2004, 05, 19);
        LocalDate currentDate = LocalDate.now();

        int age = calculateAge(birthdate, currentDate);

        System.out.println("Age: " + age + " years");
    }

    public static int calculateAge(LocalDate birthdate, LocalDate currentDate) 
    {
        
        Period p = Period.between(birthdate, currentDate);
        
          return p.getYears();
    }
}
