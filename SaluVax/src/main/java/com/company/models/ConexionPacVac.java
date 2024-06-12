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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class ConexionPacVac {
    String dniPacVac;
    String nombrePacVac;
    String apellidoVacPac;
    String direcVacPac;
    String celVacPac;
    String fechaNacPacVac;
    String kitVacPac;
    String lotePacVac;
    String enferVacPac;
    String dosisVacPac;
    String fechaVac;

    public ConexionPacVac() {
    }

    
    public ConexionPacVac(String dniPacVac, String nombrePacVac, String apellidoVacPac, String direcVacPac, String celVacPac, String fechaNacPacVac) {
        this.dniPacVac = dniPacVac;
        this.nombrePacVac = nombrePacVac;
        this.apellidoVacPac = apellidoVacPac;
        this.direcVacPac = direcVacPac;
        this.celVacPac = celVacPac;
        this.fechaNacPacVac = fechaNacPacVac;
    }

    public String getDniPacVac() {
        return dniPacVac;
    }

    public void setDniPacVac(String dniPacVac) {
        this.dniPacVac = dniPacVac;
    }

    public String getNombrePacVac() {
        return nombrePacVac;
    }

    public void setNombrePacVac(String nombrePacVac) {
        this.nombrePacVac = nombrePacVac;
    }

    public String getApellidoVacPac() {
        return apellidoVacPac;
    }

    public void setApellidoVacPac(String apellidoVacPac) {
        this.apellidoVacPac = apellidoVacPac;
    }

    public String getDirecVacPac() {
        return direcVacPac;
    }

    public void setDirecVacPac(String direcVacPac) {
        this.direcVacPac = direcVacPac;
    }

    public String getCelVacPac() {
        return celVacPac;
    }

    public void setCelVacPac(String celVacPac) {
        this.celVacPac = celVacPac;
    }

    public String getFechaNacPacVac() {
        return fechaNacPacVac;
    }

    public void setFechaNacPacVac(String fechaNacPacVac) {
        this.fechaNacPacVac = fechaNacPacVac;
    }

    public String getKitVacPac() {
        return kitVacPac;
    }

    public void setKitVacPac(String kitVacPac) {
        this.kitVacPac = kitVacPac;
    }

    public String getLotePacVac() {
        return lotePacVac;
    }

    public void setLotePacVac(String lotePacVac) {
        this.lotePacVac = lotePacVac;
    }

    public String getEnferVacPac() {
        return enferVacPac;
    }

    public void setEnferVacPac(String enferVacPac) {
        this.enferVacPac = enferVacPac;
    }

    public String getDosisVacPac() {
        return dosisVacPac;
    }

    public void setDosisVacPac(String dosisVacPac) {
        this.dosisVacPac = dosisVacPac;
    }

    public String getFechaVac() {
        return fechaVac;
    }

    public void setFechaVac(String fechaVac) {
        this.fechaVac = fechaVac;
    }
    
    public void mostrarPacVac(JTable paramTableHistorMed){
        CConection objetoConection=new CConection();
        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        paramTableHistorMed.setRowSorter(OrdenarTabla);
        String sql="";
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Celular");
        modelo.addColumn("Fecha de nacimiento");
        modelo.addColumn("Enferemedad");
        modelo.addColumn("Dosis");
        modelo.addColumn("Fecha de vacuna");
        paramTableHistorMed.setModel(modelo);
        sql="select dniPacVac, nombrePacVac, apellidoVacPac, direcVacPac, celVacPac, fechaNacPacVac, enferVacPac,"
                + "dosisVacPac,fechaVac from centrovacunacion.pacientevacunado;";
        String[] datos=new String[9];
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
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modelo.addRow(datos);
            }
            paramTableHistorMed.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: "+e);
        }
    }
    public void vacunarPaciente(JTextField paramDNI,JTextField paramNombre,JTextField paramApellido,JTextField paramDireccion,
            JTextField paramCelular,JTextField paramFechaNac,JTextField paramKit,JTextField paramLote,JTextField paramEnfer,
            JTextField paramDosis){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual=LocalDate.now();
        setDniPacVac(paramDNI.getText());
        setNombrePacVac(paramNombre.getText());
        setApellidoVacPac(paramApellido.getText());
        setDirecVacPac(paramDireccion.getText());
        setCelVacPac(paramCelular.getText());
        setFechaNacPacVac(paramFechaNac.getText());
        setKitVacPac(paramKit.getText());
        setLotePacVac(paramLote.getText());
        setEnferVacPac(paramEnfer.getText());
        setDosisVacPac(paramDosis.getText());
        setFechaVac(fechaActual.format(formatter));
        CConection conexion=new CConection();
        String consulta="insert into centrovacunacion.pacientevacunado"
                + " (dniPacVac, nombrePacVac, apellidoVacPac, direcVacPac, celVacPac, fechaNacPacVac, kitVacPac, "
                + "lotePacVac, enferVacPac, dosisVacPac, fechaVac)"
                + "values"+"(?, ?, ?, ?, ?,?,?,?,?,?,?)";
        try {
            CallableStatement cs=conexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getDniPacVac());
            cs.setString(2, getNombrePacVac());
            cs.setString(3,getApellidoVacPac());
            cs.setString(4, getDirecVacPac());
            cs.setString(5, getCelVacPac());
            cs.setString(6, getFechaNacPacVac());
            cs.setString(7, getKitVacPac());
            cs.setString(8, getLotePacVac());
            cs.setString(9, getEnferVacPac());
            cs.setString(10, getDosisVacPac());
            cs.setString(11, getFechaVac());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se resgistro correctamente, error: "+e);
        }
    }
    public void selecPacVac(JTable paramTableHistorialPacVac,JTextField paramDNI,JTextField paramNombre,JTextField paramApellido,
            JTextField paramDireccion,JTextField paramCel,JTextField paramFechaNac){
        try {
            int fila=paramTableHistorialPacVac.getSelectedRow();
            if(fila>=0){
                paramDNI.setText(paramTableHistorialPacVac.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTableHistorialPacVac.getValueAt(fila, 1).toString());
                paramApellido.setText(paramTableHistorialPacVac.getValueAt(fila, 2).toString());
                paramDireccion.setText(paramTableHistorialPacVac.getValueAt(fila, 3).toString());
                paramCel.setText(paramTableHistorialPacVac.getValueAt(fila, 4).toString());
                paramFechaNac.setText(paramTableHistorialPacVac.getValueAt(fila, 5).toString());
            }else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada.");
            }
        } catch (Exception e) {
        }
    }
    public void filtrarPorDNI(JTable paramTableHistorMed,JTextField pramDNIBuscado){
        CConection objetoConection=new CConection();
        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel> fIltrarPorDNI=new TableRowSorter<TableModel>(modelo);
        paramTableHistorMed.setRowSorter(fIltrarPorDNI);
        String sql="";
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Celular");
        modelo.addColumn("Fecha de nacimiento");
        modelo.addColumn("Enferemedad");
        modelo.addColumn("Dosis");
        modelo.addColumn("Fecha de vacuna");
        paramTableHistorMed.setModel(modelo);
        sql="select dniPacVac, nombrePacVac, apellidoVacPac, direcVacPac, celVacPac, fechaNacPacVac, enferVacPac,"
                + "dosisVacPac,fechaVac from centrovacunacion.pacientevacunado;";
        String[] datos=new String[9];
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
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modelo.addRow(datos);
            }
            paramTableHistorMed.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: "+e);
        }
        try {
            fIltrarPorDNI.setRowFilter(RowFilter.regexFilter(pramDNIBuscado.getText(), 0));
        } catch (Exception e) {
        }
    }
}
