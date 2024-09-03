//swap two numbers
public class swap {
    //call by value
    /*public static void swap(int a,int b){
        a=b;
        b=a;
        System.out.println("inside the swap:a="+a+",b="+b);
    }*/
//without using temp variable

     public static void main(String[] args) {
       /*  int a=3;
        int b=5;
        System.out.println("before:a="+a+",b="+b);
        swap(a,b);
        System.out.println("after:a="+a+",b="+b);*/
        
        int a=5,b=7;
        System.out.println("before:a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after:a="+a+",b="+b);
}    
}
