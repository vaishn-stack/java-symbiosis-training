//calculate average of no in given array
public class average 
{
    public static void main(String[] args)
    {
        int[] num={10,20,30,40,50};
        int sum=0;
        for (int n : num) 
        {
            sum += n;
            double average = (double) sum / num.length;
            System.out.println("the average is:"+ average);
        }
    }
}
