import java.sql.*;
class D 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		String sql1 = "CREATE TABLE PERSON(ID NUMBER, NAME VARCHAR2(90), AGE NUMBER)";
		String sql2 = "INSERT INTO PERSON VALUES(1, 'ABC', 22)";
		String sql3 = "INSERT INTO PERSON VALUES(2, 'XYZ', 25)";
		String sql4 = "INSERT INTO PERSON VALUES(3, 'RAMU', 20)";
		String sql5 = "INSERT INTO PERSON VALUES(4, 'VIJAY', 21)";
		String sql6 = "INSERT INTO PERSON VALUES(5, 'KIRAN', 29)";
		String sql7 = "INSERT INTO PERSON VALUES(6, 'BABU', 29)";
		String sql8 = "INSERT INTO PERSON VALUES(7, 'NAVEEN', 24)";
		String sql9 = "INSERT INTO PERSON VALUES(8, 'MANU', 26)";
		String sql10 = "INSERT INTO PERSON VALUES(9, 'ANU', 24)";
		String sql11 = "INSERT INTO PERSON VALUES(10, 'VINU', 29)";
		stmt.execute(sql1);
		stmt.execute(sql2);
		stmt.execute(sql3);
		stmt.execute(sql4);
		stmt.execute(sql5);
		stmt.execute(sql6);
		stmt.execute(sql7);
		stmt.execute(sql8);
		stmt.execute(sql9);
		stmt.execute(sql10);
		stmt.execute(sql11;
		System.out.println("done");
	}
}
