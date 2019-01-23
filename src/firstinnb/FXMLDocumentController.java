/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstinnb;

import Connectvy.ConnectionClass;
import java.beans.Statement;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Abdulaziz
 */
public class FXMLDocumentController  {
    
 public TextField textbox;
    public Label lab_out;
    public Label lab_out1;


    public void button(ActionEvent actionEvent) throws SQLException {




        lab_out1.setText("Wait");
        ConnectionClass connectionClass =new ConnectionClass();
        // we call conneClass  that we make it up
        Connection connection= connectionClass.getConnection();

       // String sql ="INSERT INTO \"azoz\".\"dbo\".\"user\" (\"name\") VALUES('"+textbox.getText()+"')";
        String sql ="INSERT INTO user VALUES('"+textbox.getText()+"')";
       java.sql.Statement statement1 = connection.createStatement();
        statement1.executeUpdate(sql);

        lab_out.setText(textbox.getText());

    }
}
