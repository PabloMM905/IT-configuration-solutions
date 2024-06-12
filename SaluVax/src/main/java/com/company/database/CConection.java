/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CConection {
    Connection conectar=null;
    String usuario="root";
    String contraseña=null;
    String bd="centrovacunacion";
    String ip="localhost";
    String puerto="3306";
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,contraseña);
            //JOptionPane.showMessageDialog(null,"Se conecto a la base de datos");
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null,"No se conecto a la base de datos, error: "+e.toString());
        } catch(ClassNotFoundException ex){
            Logger.getLogger(CConection.class.getName()).log(Level.SEVERE,null, ex);
        }
        return conectar;
    }
    
}
