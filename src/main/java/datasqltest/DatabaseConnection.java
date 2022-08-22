package datasqltest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName = "microchipapp";
        String databaseUser = "root";
        String databasePassword = "_JL=z+jV7x%Fu+aHYp$";
        String url = "jdbc:mysql://localhost/" +databaseName;


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

        }catch (Exception e){
            e.printStackTrace();
        }

        return databaseLink;



    }



}
