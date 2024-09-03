//calculate simple and compound interest
import java.util.Scanner;

public class si{
    public static void main(String[] args) {
        float p, r, t;
        double si, a, n;
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Principal:");
        p = sc.nextFloat();

        System.out.println("Rate:");
        r = sc.nextFloat();

        System.out.println("Time (in years):");
        t = sc.nextFloat();

        System.out.println("Number of time period (n):");
        n = sc.nextDouble();

        // Calculate Simple Interest
        si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);

        a = p * Math.pow((1 + r / (n * 100)), n * t);
        System.out.println("Compound Interest: " + a);

        sc.close();
    }
}
