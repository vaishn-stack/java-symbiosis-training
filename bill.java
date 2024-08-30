//calculate the customer bill

//package test;
public class bill {

	public static void main(String[] args) {
		
		String cname="CMCS";
		int noofcom=10;
		String config="i5";
		double costofcom=26500;
		int noofproj=1;
		double costofproj=50000;
		double totalcomcost=noofcom*costofcom;
		double totalprojcost=noofproj*costofproj;
		double totalbill=totalcomcost+totalcomcost;
		System.out.println("bill for customer"+cname);
		System.out.println("------------------------");
		System.out.println("item quantity cost");
		System.out.println("------------------------");
		System.out.println("com("+config+")"+noofcom+"rs"+totalcomcost);
		System.out.println("------------------------");
		System.out.println("proj"+noofproj+"rs"+totalprojcost);
		System.out.println("------------------------");
		System.out.println("totalbill:rs"+totalbill);

	}

}
