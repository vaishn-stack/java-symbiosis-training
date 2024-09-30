package preparedstatement;

import java.sql.*;

public class driver2 {

	public static void main(String[] args) {
		
						banktransaction.showbank();
						System.out.println("-----------------");
						int addbank = banktransaction.addbank1(634756,105,9000,"deposit","2023-05-04","krishna","moshi");
						System.out.println("-----------------");
						int addbank1 = banktransaction.addbank1(77865787,108,1000,"withdraw","2023-11-06","golu","indira");
						banktransaction.validatebank(101);
						System.out.println("-----------------");
						banktransaction.updatebankname(104,"dadu");
						System.out.println("-----------------");
						banktransaction.updatebankamt(110,70000);
						System.out.println("-----------------");
						banktransaction.showbank();
						System.out.println("-----------------");
						banktransaction.deletebank(77865787);
						System.out.println("-----------------");
						banktransaction.showbank();
			}

	}

