
import java.sql.*;//step 1

public class Connect {

	public static void main (String[]args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");// class loader 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Teju@2629");//step 3
	
	Statement st = con.createStatement();//create table 4
	//String query="create table student(ID int primary key,SName varchar(20),Smarks int)";//step 5
	//String query1="insert into student values(3,'Ramya',50)";
	//String query = "select * from student";
	ResultSet rs=st.executeQuery("SELECT ID,SNAME,SMARKS FROM student");
	while(rs.next())
	{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
	}
	//st.executeUpdate(query1);//step 6
	//System.out.println("Student table created successfully");//
	System.out.println("Row inserted successfully");
	st.close();
	con.close();//step 7
	
	} 
}
