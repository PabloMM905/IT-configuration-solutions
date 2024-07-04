/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.models;

import com.company.database.CConection;
import com.company.database.LoginGetSet;
import com.company.forms.FormLogeado;
import com.company.forms.FormLogeado;
import com.company.forms.FormRegistrarNuevosUsuarios;
import com.company.forms.FormRegistrarVacunas;
import com.company.forms.FormVacunarPaciente;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ConexionUsuario {
    public ArrayList<LoginGetSet> logeando(JTextField paramIdUsuario, JPasswordField paramClave){
        CConection objetoConexion=new CConection();
        String clave=new String (paramClave.getPassword());
        String sql="select * from usuarios where usuarios.idUsuario=(?) and usuarios.claveUsuario=(?);";
        ArrayList<LoginGetSet> respuesta=new ArrayList<>();
        try {
            CallableStatement cs=objetoConexion.estableceConexion().prepareCall(sql);
            cs.setString(1, paramIdUsuario.getText());
            cs.setString(2, clave);
            cs.execute();
            ResultSet rs=cs.executeQuery();
            while (rs.next()) {
                LoginGetSet login=new LoginGetSet();
                login.setDniUsuario(rs.getString("dniUsuario"));
                login.setNombreUsuario(rs.getString("nombreUsuario"));
                login.setApellidoUsuario(rs.getString("apellidoUsuario"));
                login.setRolUsuario(rs.getString("rolUsuario"));
                login.setClaveUsuario(rs.getString("claveUsuario"));
                login.setIdUsuario(rs.getString("idUsuario"));
                respuesta.add(login);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error en el acceso, error: "+e.toString());
        }
        return respuesta;
    }
    public void pasarDatos(JTextField paramIdUsuario, JPasswordField paramClave){
        ArrayList<LoginGetSet> respuesta=this.logeando(paramIdUsuario, paramClave);
        String datos[]=new String[6];
        for(LoginGetSet logeo:respuesta){
            datos[0]=logeo.getIdUsuario();
            datos[1]=logeo.getNombreUsuario();
            datos[2]=logeo.getApellidoUsuario();
            datos[3]=logeo.getRolUsuario();
            datos[4]=logeo.getClaveUsuario();
            datos[5]=logeo.getIdUsuario();
        }
        FormLogeado ingreso=new FormLogeado();
        ingreso.setVisible(true);
        ingreso.lblDni.setText(datos[0]);
        ingreso.lblNombre.setText(datos[1]);
        ingreso.lblApellido.setText(datos[2]);
        ingreso.lblRol.setText(datos[3]);
        ingreso.lblClave.setText(datos[4]);
        ingreso.lblId.setText(datos[5]);
    }
    
    public void ingresarFormsPorRol(JTextField paramIdUsuario, JPasswordField paramClave){
        ArrayList<LoginGetSet> respuesta=this.logeando(paramIdUsuario, paramClave);
        String datos[]=new String[6];
        for(LoginGetSet logeo:respuesta){
            datos[0]=logeo.getIdUsuario();
            datos[1]=logeo.getNombreUsuario();
            datos[2]=logeo.getApellidoUsuario();
            datos[3]=logeo.getRolUsuario();
            datos[4]=logeo.getClaveUsuario();
            datos[5]=logeo.getIdUsuario();
        }
        if (datos[3].equals("Admin")) {
            FormRegistrarNuevosUsuarios formularioAdmin=new FormRegistrarNuevosUsuarios();
            formularioAdmin.setVisible(true);
        }
        if (datos[3].equals("Inventarista")) {
            FormRegistrarVacunas formularioInventarista=new FormRegistrarVacunas();
            formularioInventarista.setVisible(true);
        }
        if (datos[3].equals("Personal medico")) {
            FormVacunarPaciente formualrioPeronalmedico=new FormVacunarPaciente();
            formualrioPeronalmedico.setVisible(true);
        }
    }
}
