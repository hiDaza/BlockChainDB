/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gerson.lucas_unesp
 */
public class DBFunctions {
    public Connection connection(String dbname, String user, String pass){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5439/" + dbname,user,"");
            if(conn != null){
                System.out.println("Connection Established");
            }else{
                System.out.println("Connection Failed");
            }
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        return conn;
    }
}
