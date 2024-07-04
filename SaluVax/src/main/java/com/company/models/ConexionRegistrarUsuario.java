/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.models;

import com.company.database.CConection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class ConexionRegistrarUsuario {
    String nombre;
    String apellido;
    String dni;
    String rol;
    String usuario;
    String clave;

    public ConexionRegistrarUsuario() {
    }

    public ConexionRegistrarUsuario(String nombre, String apellido, String dni, String rol, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.rol = rol;
        this.usuario = usuario;
        this.clave = clave;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public void registrarUsuarios(JTextField parametroDni, JTextField parametroNombre,JTextField parametroApellido,JComboBox parametroRol, JTextField parametroUsuario, JTextField parametroClave){
        setDni(parametroDni.getText());
        setNombre(parametroNombre.getText());
        setApellido(parametroApellido.getText());
        setRol(parametroRol.getSelectedItem().toString());
        setClave(parametroClave.getText());
        setUsuario(parametroUsuario.getText());
        
        CConection conexion=new CConection();
        String consulta="insert into centrovacunacion.usuarios (dniUsuario,nombreUsuario,apellidoUsuario,rolUsuario,idUsuario,claveUsuario)"
                + "values"+"(?, ?, ?, ?, ?, ?)";
        try {
            CallableStatement cs=conexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getDni());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setString(4, getRol());
            cs.setString(5, getClave());
            cs.setString(6, getUsuario());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se resgistro correctamente, error: "+e);
        }
    }
    public void mostrarUsuarios(JTable paramTableTotalUsuarios){
        CConection objetoConection=new CConection();
        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        paramTableTotalUsuarios.setRowSorter(OrdenarTabla);
        String sql="";
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Rol");
        modelo.addColumn("Usuario");
        modelo.addColumn("Clave");
        paramTableTotalUsuarios.setModel(modelo);
        sql="select*from centrovacunacion.usuarios;";
        String[] datos=new String [6];
        Statement st;
        try {
            st=objetoConection.estableceConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
            }
            paramTableTotalUsuarios.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: "+e);
        }
    }
    public void modificarRegistro(JTextField paramDni,JTextField paramNombre,JTextField paramApellido,JComboBox paramRol, JTextField paramClave,JTextField paramUsuario){
        this.setDni(paramDni.getText());
        this.setNombre(paramNombre.getText());
        this.setApellido(paramApellido.getText());
        this.setRol(paramRol.getSelectedItem().toString());
        this.setUsuario(paramUsuario.getText());
        this.setClave(paramClave.getText());
        CConection objetoConection=new CConection();
        String consulta="Update usuarios set usuarios.nombreUsuario=?,"
                + " usuarios.apellidoUsuario=?, usuarios.rolUsuario=?, "
                + "usuarios.claveUsuario=? , usuarios.idUsuario=?  where usuarios.dniUsuario=?";
        try {
            CallableStatement cs=objetoConection.estableceConexion().prepareCall(consulta);
            cs.setString(1, getNombre());
            cs.setString(2, getApellido());
            cs.setString(3, getRol());
            cs.setString(4, getClave());
            cs.setString(5, getUsuario());
            cs.setString(6, getDni());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar el registro, error: "+e);
        }
    }
    public void seleccionarUsuario(JTable paramTableUser,JTextField paramDni,JTextField paramNombre,JTextField paramApellido,JComboBox paramRol,JTextField paramUsuario, JTextField paramClave){
        try {
            int fila=paramTableUser.getSelectedRow();
            if(fila>=0){
                paramDni.setText(paramTableUser.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTableUser.getValueAt(fila, 1).toString());
                paramApellido.setText(paramTableUser.getValueAt(fila, 2).toString());
                paramRol.addItem(paramTableUser.getValueAt(fila, 3).toString());
                paramClave.setText(paramTableUser.getValueAt(fila, 4).toString());
                paramUsuario.setText(paramTableUser.getValueAt(fila, 5).toString());
            }else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selection, error: "+e);
        }
    }
    
    public void eliminarRegistro(JTextField paramDni){
        this.setDni(paramDni.getText());
        CConection objetoConection=new CConection();
        String consulta="Delete from usuarios where usuarios.dniUsuario=?";
        try {
            CallableStatement cs=objetoConection.estableceConexion().prepareCall(consulta);
            cs.setString(1, getDni());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro, error: "+e.toString());
        }
    }
}

