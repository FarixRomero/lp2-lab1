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
        private int codigo; //id_medicamento;
	private String nombre; //nombre;
	private String comentario; //codigo;
        
    public Medicamento(){};
    public Medicamento(String nombre, String comentario) {
        this.nombre = nombre;
        this.comentario = comentario;
    } 
	
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getComentario(){
		return comentario;
	}
	public void setComentario(String comentario){
		this.comentario = comentario;
	}
}
