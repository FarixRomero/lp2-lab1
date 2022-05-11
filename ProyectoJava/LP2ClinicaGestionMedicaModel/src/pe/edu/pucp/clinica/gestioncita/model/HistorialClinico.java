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
        private Paciente paciente;
	
	//Constructores
	public HistorialClinico(){
            paciente = new Paciente();
	}
	public HistorialClinico(int nroHistoria){
		this.nroHistoria = nroHistoria;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
	
	  
}
