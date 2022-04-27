import java.util.ArrayList;
class Administrador extends Usuario {
    private int codAministrador;
	private Especialidad especialidad;
	private ArrayList <Medico> medicos;
	
    public Administrador(){
		medicos = new ArrayList<>();
	}
    public Administrador(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad,int codAministrador,Especialidad especialidad2){
		super(correo,username,password,estado,nombre,apellido,DNI,edad);
		this.codAministrador=codAministrador;
		this.especialidad=especialidad2;
		medicos = new ArrayList<>();
    }	
    
    public int getCodigoAdministrador(){
		return this.codAministrador;
	}
	
	public void setCodigoAdministrador(int codAministrador){
        this.codAministrador=codAministrador;
    }
	public ArrayList <Medico> getMedico(){
		return medicos;
	}
	public void setMedico(ArrayList <Medico> medicos){
		this.medicos = medicos;
	}
	
	public Especialidad getEspecialidad(){
		return this.especialidad;
	}
	public void setEspecialidad(Especialidad especialidad2){
		this.especialidad=especialidad2;
	}
	// Funciones propias de Administrador
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
