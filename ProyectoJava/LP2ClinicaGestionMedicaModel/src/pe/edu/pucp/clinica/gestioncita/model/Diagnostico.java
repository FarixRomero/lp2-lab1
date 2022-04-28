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
	private String resultado;
	private String observacion;
	private RecetaMedica recetas;
	
	//Constructores
	public Diagnostico(){};
	public Diagnostico(String resultado,String observacion, RecetaMedica recipe){
		this.resultado = resultado;
		this.observacion = observacion;
		this.recetas=recipe;
	}
	
	//Setters y getters
	public String getResultado(){
		return resultado;
	}
	public void setResultado(String resultado){
		this.resultado = resultado;
	}
	
	public String getObservacion(){
		return observacion;
	}
	public void setObservacion(String observacion){
		this.observacion = observacion;
	}
	
	public void setReceta(RecetaMedica recetas){
		this.recetas=recetas;
	}
	public RecetaMedica getReceta(RecetaMedica recetas){
		return this.recetas;
	}
}
