/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    
    public static DatabaseConnection getInstance() {
        if(instance == null){
            instance = new DatabaseConnection();
        }
    return instance;
    }
    
    private DatabaseConnection() {
    
    }
    
    public void connectToDatabase() throws SQLException, ClassNotFoundException {
        String server = "localhost";
        String port = "3306";
        String database = "pdm_project";
        String user = "root";
        String password = "1234567pdmdb";
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database + "?allowPublicKeyRetrieval=true&useSSL=false", user, password);
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_pdm_project","freedb_anhoang935","2NqV@7%Ur$TJqTu");
    
    }
    
    public Connection getConnection() {
        return connection;
    }
    
}


