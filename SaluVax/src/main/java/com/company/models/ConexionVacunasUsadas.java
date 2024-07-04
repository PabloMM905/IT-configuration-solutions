/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.models;

import com.company.database.CConection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ConexionVacunasUsadas {
    String kit;
    String lote;
    String enfermedad;
    String dosis;
    String fechaUsada;

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

    public String getFechaUsada() {
        return fechaUsada;
    }

    public void setFechaUsada(String fechaCaducidad) {
        this.fechaUsada = fechaCaducidad;
    }
    public void registrarVacUsada(JTextField parametroKit,JTextField parametroLote,JTextField parametroEnfermedad,
            JTextField parametroDosis){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual=LocalDate.now();
        setKit(parametroKit.getText());
        setLote(parametroLote.getText());
        setEnfermedad(parametroEnfermedad.getText());
        setDosis(parametroDosis.getText());
        setFechaUsada(fechaActual.format(formatter));
        CConection conexion=new CConection();
        String consulta="insert into centrovacunacion.vacunasusadas (kit,lote,enfermedad,dosis,fechaUso)"
                + "values"+"(?, ?, ?, ?, ?);";
        try {
            CallableStatement cs=conexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getKit());
            cs.setString(2, getLote());
            cs.setString(3,getEnfermedad());
            cs.setString(4, getDosis());
            cs.setString(5, getFechaUsada());
            cs.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se resgistro correctamente, error: "+e.toString());
            System.out.println("No se resgistro correctamente, error: "+e.toString());
        }
    }
}
