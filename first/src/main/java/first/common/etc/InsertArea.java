package first.common.etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertArea {
//Area table
	 public static void main(String[] args) {
		    // 1. 데이터베이스 연동 클래스 로드
		 
		   
		    //데이터베이스에 접속하기 위한 변수
		    Connection con = null;
		    //SQL 구문을 실행하기 위한 변수
		    Statement stmt = null;
		    //Select 구문 실행했을 때 결과를 저장하기 위한 변수
		    ResultSet rs = null;		     
		    PreparedStatement pstmt = null;

		    try{
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      System.out.println("ready");

		    //삽입을 위한 Statement 변수 선언
		      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
		          "shop","111111");
		       
		      //sql 문장을 가지고 PreparedStatement 객체 생성
		      System.out.println("con");
		      pstmt = con.prepareStatement("INSERT INTO AREA VALUES(?,?,?)");
		      //?에 데이터를 바인딩
		      
		      for(int i =1;i<=10;i++) {
		    	  System.out.println("insert");
		    	 double lat= 37.507955; //-0.0018;
		    	 double longi= 127.023286;

		    
		      pstmt.setInt(1,i);
		      pstmt.setString(2, Double.toString(lat));
		      pstmt.setString(3, Double.toString(longi+0.0023*(i-1)));
		      pstmt.executeUpdate();
		      }
		      con.commit();
		      
		       
		   
		       
		    } catch(Exception e){
		      System.out.println(e.getMessage());
		    }
		    finally{
		      try{
		        if(rs != null)rs.close();
		        if(stmt != null)stmt.close();
		        if(con != null)con.close();
		      }
		      catch(Exception e){}
		    }
		 
		  }


}
