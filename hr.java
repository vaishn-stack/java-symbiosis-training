/*write a program to calculate netpay for an employee whose basic salary is 10000 da is 2% of basic hra
5% of basic ta 1% of basic his elligible for 2500 per month as pa contribution.you are requested to 
accept the data as personal details which are applicable (name,age,address,dob) using inheritance*/

	class person
	{
		 int age=20;
		 String name="vaish";
		 float salary=10000;
		 String addr="nashik";
		 String date="19-05-2004";
		
		public void setdata() 
		{
			System.out.println("enter the employee age:"+age);
			System.out.println("enter the employee name:"+name);
			System.out.println("enter the employee salary:"+salary);
			System.out.println("enter the employee address:"+addr);
			System.out.println("enter the employee date:"+date);
			 this.age=20;
			 this.name="vaish";
			 this.salary=10000;
		     this.addr="nashik";
			 this.date="19-05-2004";

		}	
       
		public int getage()
            {
                return age;
            }
            public String getname()
            {
                return name;
            }
			public float getsalary()
			{
				return salary;
			}
			public String getaddress() 
			{
				return addr;
			}
			public String getdate()
		    {
				return date;
			}
	}	
	
class employee extends person
{
		public void show()
		{
			setdata();  // No need to create a new object, just call the method directly
        System.out.println("Age:" + getage());
        System.out.println("Name:" + getname());
        System.out.println("Salary:" + getsalary());
        System.out.println("Address:" + getaddress());
        System.out.println("Date of Joining:" + getdate());
        }
            public int cal() 
            {
                int bs=10000;
                int da=9800;
                int hra=9500;
                int ta=9900;
                int netpay=bs+da+hra+ta;
                return netpay;
				//System.out.println(cal());
            }			
}
public class hr
{
	public static void main(String[] args)
     {
		employee e= new employee();
        e.show();
		int netPay = e.cal();
        System.out.println("Net Pay: " + netPay);
	}
}