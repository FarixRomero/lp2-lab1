/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestionreceta.model;

/**
 *
 * @author ISAI
 */
public class LineaRecetaMedica {
    private int idLinea;
    private int cantidad;
    private RecetaMedica recetaMedica;
    private Medicamento medicamento;
    public LineaRecetaMedica(){
    };
    public LineaRecetaMedica(int cantidad, RecetaMedica recetaMedica, Medicamento medicamento) {
        this.cantidad = cantidad;
        this.recetaMedica = recetaMedica;
        this.medicamento = medicamento;
    }
    public LineaRecetaMedica(int cantidad, Medicamento medicamento) {
        this.cantidad = cantidad;
        this.medicamento = medicamento;
    }
    
    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    
    public RecetaMedica getRecetaMedica() {
        return recetaMedica;
    }

    public void setRecetaMedica(RecetaMedica recetaMedica) {
        this.recetaMedica = recetaMedica;
    }

    
    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
