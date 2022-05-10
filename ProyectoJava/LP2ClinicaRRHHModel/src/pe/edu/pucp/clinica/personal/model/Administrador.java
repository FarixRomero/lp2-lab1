package pe.edu.pucp.clinica.personal.model;
import java.util.ArrayList;
import java.util.Date;
public class Administrador extends Usuario{
    private int id_administrador;
    private Especialidad especialidad;
    private ArrayList<Medico> medicos;
    
    // CONSTRUCTORES
    public Administrador(){
        medicos=new ArrayList<>();
        especialidad = new Especialidad();
    }
    public Administrador( Especialidad especialidad, String DNI, String nombre,
                        String apellido,  Date fecha_nacimiento, String email,
                        String username, String password, int estado) {
        super(DNI, nombre, apellido,  fecha_nacimiento, email, username, password, estado);
        this.especialidad = especialidad;
    }    
    
    // GETTERS Y SETTERS
    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }
   

    // FUNCIONES 
    public void GenerarListaPacientes(){}
    public void GestionarUsuarios(){}
    public void GestionarMedicos(){}
    public void GestionarConsultorios(){}
    public void GestionarMedicamentos(){}

    public void CambiarEstadoCita(){}
    public void CrearConsultorio(){}
    public void EditarConsultorio(){}
    public void EliminarConsultorio(){}
    public void AnhadirMedicamento(){}
    public void EditarMedicamento(){}
    public void EliminarMedicamento(){}
    public void GestionarEspecialidad(){}
    public void VisualizarCitas(){}
    public void GestionarHorariosMedicos(){}

    @Override
	public void Login(){
	}
    @Override
	public void RecuperarPassword(){
	}
    @Override
	public void ModificarDatos(){
	}
    @Override
	public void GestionarCitas(){
	}
}

