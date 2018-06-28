package first.common.etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class HiveUpload {
	
//���̺긦 ���� ���·� ���������� �����ؾ���: hive --service hiveserver2		
		public static void main(String[] args) throws Exception {
			
			
			      Class.forName("org.apache.hive.jdbc.HiveDriver"); //hive driver loading
			      Connection conn = DriverManager.getConnection("jdbc:hive2://192.168.111.101:10000/default", "root", "111111");
			      Statement stmt = conn.createStatement();
			      stmt.execute(
			          "LOAD DATA LOCAL INPATH '/ftp/pub/log.txt'"
			          + "OVERWRITE INTO TABLE danger");
			      conn.close();
			      System.out.println("Success....");
			      
		}
	}
	

