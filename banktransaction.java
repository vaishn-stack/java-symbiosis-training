package preparedstatement;
import java.sql.*;


	public class banktransaction {
		static Connection cn;
		static PreparedStatement pst;
		static {
			cn = dbutil1.getConnection();
			if(cn !=null) {
				System.out.println("JDBC connection is taken...");
			}
	}


	public static int addbank1(int ano,int tno,double amt,String atype,String dateoftransaction,String cname,String addr) {
		int n =0;
		try {
			 pst = cn.prepareStatement("INSERT INTO bank values(?,?,?,?,?)");
			pst.setInt(1,ano);
			pst.setInt(2,tno);
			pst.setDouble(3,amt);
			pst.setString(4,atype);
			pst.setString(5,dateoftransaction);
			pst.setString(6,cname);
			pst.setString(7,addr);
			System.out.println("INSERT INTO bank values(?,?,?,?,?)");
			n = pst.executeUpdate();				
		} catch (SQLException e) {
			System.out.println("error..........."+e.getMessage());
			n = 0;
		}
		return n;
	}

		public static int validatebank(int ano) {
			int n = 0;
			try {
				pst = cn.prepareStatement("SELECT * FROM bank WHERE ano="+ano);
				ResultSet r =pst.executeQuery();
				if(r.next()) {
					if(r.getInt(1)!= 0)
						n =1;
					System.out.println("SELECT * FROM bank WHERE ano="+ano);
				}
			} catch (SQLException e) {
				System.out.println("error.........."+ e.getMessage());
			}
			return n;
		
			}
		public static boolean updatebankname(int ano,String cname) {
			boolean status = false;
			
			try {
				if(validatebank(ano)==1) {
					pst = cn.prepareStatement("update bank set cname="+cname+"where ano="+ano);
					ResultSet r =pst.executeQuery();
					if(r.next()) {
						int n;
						if(r.getInt(1)!= 0)
							n =1;
						System.out.println("update bank set cname="+cname+"where ano="+ano);
					}
					status = true;
				}else {
					System.out.println("no such bank records...");
				}

			} catch (SQLException e) {
				System.out.println("error.........."+ e.getMessage());
				e.printStackTrace();
			}
		return status;	
	}

	public static boolean updatebankamt(int ano,double amt) {
		boolean status = false;
		try {
			if(validatebank(ano)==8) {
				pst = cn.prepareStatement("UPDATE bank SET ano="+ano+" where amt="+amt);
				ResultSet r =pst.executeQuery();
				if(r.next()) {
					int n;
					if(r.getInt(1)!= 0)
						n =1;
					System.out.println("UPDATE bank SET ano="+ano+" where amt="+amt);
				}
				status = true;
			}else
			    System.out.println("no such bank records...");	
		} catch (SQLException e) {
			System.out.println("error.........."+ e.getMessage());
		}
		return status;	
		
	}

	public static boolean deletebank(int ano) {
		boolean status = false;
		try {
			int n = validatebank(ano);
			if(n == 1) {
				pst = cn.prepareStatement( "DELETE FROM bank WHERE ano ="+ano);
				pst.executeUpdate();
				status = true;
				System.out.println("DELETE FROM bank WHERE ano ="+ano);
			}
		} catch (SQLException e) {
			System.out.println("error.........."+ e.getMessage());
		}
		return status;	
	}
	public static void showbank() {
		try {
			pst = cn.prepareStatement("SELECT * FROM bank");
			ResultSet r = pst.executeQuery();
			if(r.next()) {
				while(r.next()) {
					System.out.println(r.getInt(1)+"\t"+r.getInt(2)+"\t"+r.getDouble(3)+"\t"+r.getString(4)+
							"\t"+r.getDate(5)+"\t"+r.getString(6)+"\t"+r.getString(7));
					System.out.println("SELECT * FROM bank");
				}
			}else
				System.out.println("no such bank records...");
			r.close();
		} catch (SQLException e) {
			System.out.println("error.........."+ e.getMessage());
		}	
		
	}


	public void closeConnection() {
		try {
			pst.close();
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
