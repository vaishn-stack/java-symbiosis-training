//calculate power of given number
public class power {
    public static void main(String[] args) {
          
              int n = 5, rem = 2;
          
              int result = 1;
          
              while (rem != 0) {
                result *= n;
                --rem;
              }
          
              System.out.println("Answer = " + result);
            }
          }
