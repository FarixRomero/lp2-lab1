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
        private String codigo;
	private String nombre;
	private String comentario;
	
	public String getCodigo(){
		return codigo;
	}
	public void setCodigo(){
		this.codigo = codigo;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(){
		this.nombre = nombre;
	}
	
	public String getComentario(){
		return comentario;
	}
	public void setComentario(){
		this.comentario = comentario;
	}
}
