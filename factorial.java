//find the factorial of the given no
public class factorial {
    
        public static void main(String[] args) 
        {
            int num = 15; 
            int factorial = 1;
            for(int i = 1; i <= num; ++i) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
    
    
