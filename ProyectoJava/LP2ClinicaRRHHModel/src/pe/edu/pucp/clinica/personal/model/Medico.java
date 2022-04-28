package pe.edu.pucp.clinica.personal.model;
import java.util.ArrayList;
import java.util.Date;

public class Medico extends Usuario {
    public static int i=1;
    private int id_medico;
    private double calificacion;
    private int cant_pacientes;
    private Especialidad especialidad;

    public Medico() {}

    public Medico(double calificacion, int cant_pacientes, Especialidad especialidad, String DNI, String nombre, String apellido, int edad, Date fecha_nacimiento, String email, String username, String password, int estado) {
        super(DNI, nombre, apellido, edad, fecha_nacimiento, email, username, password, estado);
        this.calificacion = calificacion;
        this.cant_pacientes = cant_pacientes;
        this.especialidad = especialidad;
        this.id_medico=i;
        i++;
    }
    
    // GETTERS Y SETTERS
    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getCant_pacientes() {
        return cant_pacientes;
    }

    public void setCant_pacientes(int cant_pacientes) {
        this.cant_pacientes = cant_pacientes;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // Comportamiento o Métodos
    public void mostrarPerfilDoctores(){}
    public void RegistrarRecetaMedica(){}
    public void GenerarDiagnostico(){}
    public void VisualizarCitas(){}
    public void ChatearPaciente(){}
 
    
    @Override
    public String consultarDatosUsuario(){
        return "Nro. Medico: "+ this.id_medico + " Nombre: "+ getNombre()+ getApellido() +" - "+getEmail();
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
