import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentApplication {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/";
        String userName="root";
        String password="1312";
        try{

            // Establishing the connection
                Connection conn = DriverManager.getConnection(url, userName , password);
            Statement stm=conn.createStatement();
            System.out.println("Connected to the database successfully!");
        }
        catch (Exception e){
            System.out.println("not connected");
        }


    }
}
