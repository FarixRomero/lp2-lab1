/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestioncita.model;

import java.util.ArrayList;
/**
 *
 * @author ISAI
 */
public class HistorialClinico {
    // Estado o Caracteristicas
	private int nroHistoria;
	private ArrayList<Diagnostico> diagnosticos;
	
	//Constructores
	public HistorialClinico(){
		diagnosticos = new ArrayList<>();
	}
	public HistorialClinico(int nroHistoria){
		this.nroHistoria = nroHistoria;
		diagnosticos = new ArrayList<>();
	}
	
	//destructores
	public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
	//metodos
	public int getNroHistoria(){
		return nroHistoria;
	}
	public void setNroHistoria(int nroHistoria){
		this.nroHistoria = nroHistoria;
	}
	
	public ArrayList<Diagnostico> getDiagnostico(){
		return this.diagnosticos;
	}
	public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos){
		this.diagnosticos = diagnosticos;
	}    
}
