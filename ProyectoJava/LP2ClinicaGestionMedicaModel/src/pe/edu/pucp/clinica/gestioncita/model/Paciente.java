/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestioncita.model;

import java.util.ArrayList;
import java.util.Date;
import pe.edu.pucp.clinica.herramientas.model.Chat;
import pe.edu.pucp.clinica.personal.model.Usuario;

/**
 *
 * @author ISAI
 */
public class Paciente extends Usuario{
    // Estado o características
        private int idPaciente;
	private boolean seguro;
	
    // Constructores
    public Paciente(){
    }
    
//    public Paciente(String DNI, String nombre, String apellido, 
//            int edad, Date fecha_nacimiento,String email, String username, 
//            String password, int estado, boolean seguro){
//        super(DNI, nombre, apellido, edad, fecha_nacimiento, email, username, password, estado);
//        this.seguro = seguro;
//    }
    // Destructores
    public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
    // Getters

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    
    public boolean getSeguro(){
        return this.seguro;
    }

    // Setters
    public void setSeguro(boolean seguro){
        this.seguro=seguro;
    }

	
	
	
	// Comportamiento o Métodos
	public void CalificarMedico(){}
	public void Comentar(){}
	public void VisualizarDiagnostico(){}
	public void VisualizarAtencion(){}
	public void revisarRequerimientos(){}
	public void ChatearMedico(){}
	public void VisualizarCitas(){}
        public void mostrarPerfilDoctores(){};
        public void VisualizarColaDeCitas(){};
	
	@Override
	public String consultarDatosUsuario(){
		return "Nro. Paciente: "+ this.idPaciente + "Nombre: "+ getNombre()+ getApellido() +" - "+getEmail();
	}
	@Override
	public void Login(){}
	@Override
	public void RecuperarPassword(){}
	@Override
	public void ModificarDatos(){}
	@Override
	public void GestionarCitas(){}
}
