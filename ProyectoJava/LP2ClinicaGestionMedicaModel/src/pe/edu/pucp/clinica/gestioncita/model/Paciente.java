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
	private boolean seguro;
	private int codPaciente;
	private ArrayList <Chat> chats;
	
    // Constructores
    public Paciente(){
        chats = new ArrayList<>();
    }
    
    public Paciente(String DNI, String nombre, String apellido, 
            int edad, Date fecha_nacimiento,String email, String username, 
            String password, int estado, boolean seguro){
        super(DNI, nombre, apellido, edad, fecha_nacimiento, email, username, password, estado);
        this.seguro = seguro;
        chats = new ArrayList<>();
    }
    // Destructores
    public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
    // Getters
    public boolean getSeguro(){
        return this.seguro;
    }
	public int getCodPaciente(){
		return this.codPaciente;
	}

    // Setters
    public void setSeguro(boolean seguro){
        this.seguro=seguro;
    }
	public void setCodPaciente(int codPaciente){
		this.codPaciente=codPaciente;
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
		return "Nro. Paciente: "+ this.codPaciente + "Nombre: "+ getNombre()+ getApellido() +" - "+getEmail();
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
