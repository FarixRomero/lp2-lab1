import java.util.ArrayList;
class Paciente extends Usuario{
	
	// Estado o características
	private boolean seguro;
	private int codPaciente;
	private ArrayList <Chat> chats;
	
    // Constructores
    public Paciente(){}
    public Paciente(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad,boolean seguro,int codPaciente){
        super(correo,username,password,estado,nombre,apellido,DNI,edad);
		this.seguro=seguro;
		this.codPaciente=codPaciente;
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
	
	public void CalificarMedico(){}
	public void Comentar(){}
	public void VisualizarDiagnostico(){}
	public void VisualizarAtencion(){}
	public void ChatearMedico(){}
	
	// Comportamiento o Métodos
	@Override
	public String consultarDatosUsuario(){
		return "Nro. Paciente: "+ this.codPaciente + "Nombre: "+ getNombre()+ getApellido() +" - "+getCorreo();
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
