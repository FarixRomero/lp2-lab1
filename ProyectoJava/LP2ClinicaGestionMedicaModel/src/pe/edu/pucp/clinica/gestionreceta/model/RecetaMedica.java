/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestionreceta.model;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestioncita.model.Diagnostico;

/**
 *
 * @author ISAI
 */
public class RecetaMedica {

    private int idReceta;
    private String codReceta;
    private ArrayList<LineaRecetaMedica> lineasRecetaMedica;
    private Diagnostico diagnostico;

    public RecetaMedica() {
        lineasRecetaMedica = new ArrayList<>();
    }

    public RecetaMedica(String codReceta, Diagnostico diagnostico) {
        lineasRecetaMedica = new ArrayList<>();
        this.codReceta = codReceta;
        this.diagnostico = diagnostico;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public ArrayList<LineaRecetaMedica> getLineasRecetaMedica() {
        return lineasRecetaMedica;
    }

    public void setLineasRecetaMedica(ArrayList<LineaRecetaMedica> lineasRecetaMedica) {
        this.lineasRecetaMedica = lineasRecetaMedica;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getCodReceta() {
        return codReceta;
    }

    public void setCodReceta(String codReceta) {
        this.codReceta = codReceta;
    }
}
