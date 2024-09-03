    //sort of an array in ascending order.

    public class sort {
	public static void main(String[] args) 
    {
		
		int temp=0;
	    
		int [] a=new int[] {5,7,3,9,4};
	     
	     System.out.println("enter the elements:");
	     for(int i=0;i<a.length;i++)
	     {
	    	
	    	 System.out.println(a[i]+"");
	     }
	     for(int i=0;i<a.length;i++)
	     {
	    	 for(int j=i+1;j<a.length;j++)
	    	 {
	    		 if(a[i]>a[j])
	    		 {
	    			 temp=a[i];
	    			 a[i]=a[j];
	    			 a[j]=temp;
	    			 System.out.println();	 
	    		 }
	    	 }
	     }
	     System.out.println("sorted in ascending order:");

         for(int i=0;i<a.length;i++)
	     {
            System.out.println(a[i]+"");
	     }
      }
}