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
public class Medicamento {
    private int id_medicamento; //id_medicamento;
    private String nombre; //nombre;
    private String codigo; //codigo;

    public Medicamento(){};
    public Medicamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    } 

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
	
}
