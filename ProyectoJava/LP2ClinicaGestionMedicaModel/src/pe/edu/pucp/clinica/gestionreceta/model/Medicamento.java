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
        private int codigo;
	private String nombre;
	private String comentario;
	
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int Codigo){
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
