/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestioncita.model;

import pe.edu.pucp.clinica.gestionreceta.model.RecetaMedica;

/**
 *
 * @author ISAI
 */
public class Diagnostico {

    //Atributos
    private int id_diagnostico;
    private String resultado;
    private String observacion;
    private CitaMedica citaMedica;
    private HistorialClinico historialClinico;

    //Constructores
    public Diagnostico() {
    }

    public Diagnostico(String resultado, String observacion) {
        this.resultado = resultado;
        this.observacion = observacion;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

    //Setters y getters
    public int getId_diagnostico() {
        return id_diagnostico;
    }

    public void setId_diagnostico(int id_diagnostico) {
        this.id_diagnostico = id_diagnostico;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
