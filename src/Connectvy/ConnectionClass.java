/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectvy;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Abdulaziz
 */
public class ConnectionClass {
    public Connection connection;
    
    public  Connection getConnection(){
        String dbName="sql12252436";
        String userName="sql12252436";
        String password="lGryJjY5EN";

        String dbName1="test";
        String userName1="root";
        String password1="";

        String dbName2="azoz";
        String userName2="sa";
        String password2="1418";




        try {
            Class.forName("com.mysql.jdbc.Driver");

           // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

           //connection= DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/"+dbName,userName,password);

         connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName1,userName1,password1);
            // its ok with port and with out port
          // connection= DriverManager.getConnection("jdbc:sqlserver://192.168.1.90:1433; DatabaseName=azoz","sa","1418");
//


        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }



    
}
