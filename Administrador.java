import java.util.ArrayList;
class Administrador extends Usuario {
    private int codAministrador;
	private Especialidad especialidad;
	private ArrayList <Medico> medicos;
	
    public Administrador(){}
    public Administrador(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad,int codAministrador,Especialidad especialidad2){
		super(correo,username,password,estado,nombre,apellido,DNI,edad);
		this.codAministrador=codAministrador;
		this.especialidad=especialidad2;
    }	
    
    public int getCodigoAdministrador(){
		return this.codAministrador;
	}
	
	public void setCodigoAdministrador(int codAministrador){
        this.codAministrador=codAministrador;
    }
	
	// Funciones propias de Administrador
    void GenerarListaPacientes(){}
    void GestionarUsuarios(){}
    void GestionarMedicos(){}
    void GestionarConsultorios(){}
    void GestionarMedicamentos(){}
	

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