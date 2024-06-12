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
import static java.util.Locale.filter;
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
public class ConexionVacunasDisponibles {
    String kit;
    String lote;
    String enfermedad;
    String dosis;
    String fechaCaducidad;

    public ConexionVacunasDisponibles(String kit, String lote, String enfermedad, String dosis, String fechaCaducidad) {
        this.kit = kit;
        this.lote = lote;
        this.enfermedad = enfermedad;
        this.dosis = dosis;
        this.fechaCaducidad = fechaCaducidad;
    }

    public ConexionVacunasDisponibles() {
        
    }
    
    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public void registrarVacunaDisponible(JTextField parametroKit,JTextField parametroLote,JTextField parametroEnfermedad,JTextField parametroDosis, JTextField parametroFechaCaducidad){
        setKit(parametroKit.getText());
        setLote(parametroLote.getText());
        setEnfermedad(parametroEnfermedad.getText());
        setDosis(parametroDosis.getText());
        setFechaCaducidad(parametroFechaCaducidad.getText());
        CConection conexion=new CConection();
        String consulta="insert into centrovacunacion.vacunasdisponibles (kit,lote,enfermedad,dosis,fechaCaducidad)"
                + "values"+"(?, ?, ?, ?, ?)";
        try {
            CallableStatement cs=conexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getKit());
            cs.setString(2, getLote());
            cs.setString(3, getEnfermedad());
            cs.setString(4, getDosis());
            cs.setString(5, getFechaCaducidad());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se resgistro correctamente, error: "+e);
        }
    }
    public void mostrarVacunasDisponibles(JTable paramTableTotalVacunasDisponibles){
        CConection objetoConection=new CConection();
        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        paramTableTotalVacunasDisponibles.setRowSorter(OrdenarTabla);
        String sql="";
        modelo.addColumn("Kit");
        modelo.addColumn("Lote");
        modelo.addColumn("Enfermedad");
        modelo.addColumn("Dosis");
        modelo.addColumn("Fecha de caducidad");
        paramTableTotalVacunasDisponibles.setModel(modelo);
        sql="select*from centrovacunacion.vacunasdisponibles;";
        String[] datos=new String [5];
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
                modelo.addRow(datos);
            }
            paramTableTotalVacunasDisponibles.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: "+e);
        }
    }
    public void modificarRegistro(JTextField paramKit,JTextField paramLote,JTextField paramEnfermedad,JTextField paramDosis,JTextField paramFechaCad){
        this.setKit(paramKit.getText());
        this.setLote(paramLote.getText());
        this.setEnfermedad(paramEnfermedad.getText());
        this.setDosis(paramDosis.getText());
        this.setFechaCaducidad(paramFechaCad.getText());
        CConection objetoConection=new CConection();
        String consulta="Update vacunasdisponibles set vacunasdisponibles.lote=?,"
                + " vacunasdisponibles.enfermedad=?, vacunasdisponibles.dosis=?, "
                + "vacunasdisponibles.fechaCaducidad=? where vacunasdisponibles.kit=?";
        try {
            CallableStatement cs=objetoConection.estableceConexion().prepareCall(consulta);
            cs.setString(1, getLote());
            cs.setString(2, getEnfermedad());
            cs.setString(3, getDosis());
            cs.setString(4, getFechaCaducidad());
            cs.setString(5, getKit());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar el registro, error: "+e);
        }
    }
    public void seleccionarVacunaDisponible(JTable paramTableVacDis,JTextField paramKit,JTextField paramLote,JTextField paramEnfer,JTextField paramDosis,JTextField paramFecCad){
        try {
            int fila=paramTableVacDis.getSelectedRow();
            if(fila>=0){
                paramKit.setText(paramTableVacDis.getValueAt(fila, 0).toString());
                paramLote.setText(paramTableVacDis.getValueAt(fila, 1).toString());
                paramEnfer.setText(paramTableVacDis.getValueAt(fila, 2).toString());
                paramDosis.setText(paramTableVacDis.getValueAt(fila, 3).toString());
                paramFecCad.setText(paramTableVacDis.getValueAt(fila, 4).toString());
            }else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selection, error: "+e);
        }
    }
    public boolean registroCaducado(JTextField paramFecCad){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual=LocalDate.now();
        LocalDate fecCad=LocalDate.parse(paramFecCad.getText(),formatter);
        if(fechaActual.isAfter(fecCad)){
            JOptionPane.showMessageDialog(null, "La vacuna esta caducada, no se puede regisrar.");
            return false;
        }else{
            return true;
        }
    }
    public void eliminarRegistro(JTextField paramKit){
        this.setKit(paramKit.getText());
        CConection objetoConection=new CConection();
        String consulta="Delete from vacunasdisponibles where vacunasdisponibles.kit=?";
        try {
            CallableStatement cs=objetoConection.estableceConexion().prepareCall(consulta);
            cs.setString(1, getKit());
            cs.execute();
//            JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro, error: "+e.toString());
        }
    }
    public void filtrarVacunaPorKitOLote(JTable paramTableTotalVacunasEncontradas, JTextField kitBuscado, int indice){
        CConection objetoConection=new CConection();
        DefaultTableModel modelo=new DefaultTableModel();
        TableRowSorter<TableModel> filtrarPorKit=new TableRowSorter<TableModel>(modelo);
        paramTableTotalVacunasEncontradas.setRowSorter(filtrarPorKit);
        String sql="";
        modelo.addColumn("Kit");
        modelo.addColumn("Lote");
        modelo.addColumn("Enfermedad");
        modelo.addColumn("Dosis");
        modelo.addColumn("Fecha de caducidad");
        paramTableTotalVacunasEncontradas.setModel(modelo);
        sql="select*from centrovacunacion.vacunasdisponibles;";
        String[] datos=new String [5];
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
                modelo.addRow(datos);
            }
            paramTableTotalVacunasEncontradas.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: "+e);
        }
        try {
            filtrarPorKit.setRowFilter(RowFilter.regexFilter(kitBuscado.getText(), indice));
        } catch (Exception e) {
        }
    }
}
