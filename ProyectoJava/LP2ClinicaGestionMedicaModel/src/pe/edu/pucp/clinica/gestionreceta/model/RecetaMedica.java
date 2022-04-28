/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestionreceta.model;

import java.util.ArrayList;
/**
 *
 * @author ISAI
 */
public class RecetaMedica {
        private String codReceta;
        private ArrayList<Medicamento> medicamentos;
	
	public RecetaMedica(){
		medicamentos = new ArrayList<>();
	}

        public String getCodReceta() {
            return codReceta;
        }

        public void setCodReceta(String codReceta) {
            this.codReceta = codReceta;
        } 
	
	public ArrayList<Medicamento> getMedicamentos(){
		return medicamentos;
	}
	public void setMedicamentos(ArrayList<Medicamento>medicamentos){
		this.medicamentos = medicamentos;
	}
}
