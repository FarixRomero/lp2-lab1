import java.util.ArrayList;
class Medico extends Usuario{
	
    // Estado o características
    private float calificacion;
    private int cantPacientes;
    private int codMedico;
	private Especialidad especialidad;
	private ArrayList <Comentario> comentarios;
	private ArrayList <Chat> chats;
    // Constructores
    public Medico(){
		comentarios = new ArrayList<>();
	}
    public Medico(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad,float calificacion,int cantPacientes,int codMedico,Especialidad especialidad2){
        super(correo,username,password,estado,nombre,apellido,DNI,edad);
		this.calificacion=calificacion;
        this.cantPacientes=cantPacientes;
        this.codMedico = codMedico;
		this.especialidad=especialidad2;
		comentarios = new ArrayList<>();
    }
    // Destructores
    public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
    // Getters
    public float getCalificacion(){
        return this.calificacion;
    }
    public int getCantPacientes(){
        return this.cantPacientes;
    }
    public int getCodMedico(){
        return this.codMedico;
    }
	public ArrayList <Comentario> getComentario(){
		return comentarios;
	}
	public Especialidad getEspecialidad(){
		return this.especialidad;
	}
	
	
    // Setters
    public void setCalificacion(float calificacion){
        this.calificacion=calificacion;
    }
    public void setCantPacientes(int cantPacientes){
        this.cantPacientes=cantPacientes;
    }
    public void setCodMedico(int codMedico){
        this.codMedico=codMedico;
    }
	public void setComentario(ArrayList <Comentario> comentarios){
		this.comentarios = comentarios;
	}
	public void setEspecialidad(Especialidad especialidad2){
		this.especialidad=especialidad2;
	}
	
    // Comportamiento o Métodos
   public void mostrarPerfilDoctores(){}
   public void RegistrarRecetaMedica(){}
   public void GenerarDiagnostico(){}
   public void VisualizarCitas(){}
   public void ChatearPaciente(){}
	
	
    @Override
    public String consultarDatosUsuario(){
        return "Nro. Medico: "+ this.codMedico + " Nombre: "+ getNombre()+ getApellido() +" - "+getCorreo();
    }
	@Override
	public void Login(){}
	@Override
	public void RecuperarPassword(){}
	@Override
	public void ModificarDatos(){}
	@Override
	public void GestionarCitas(){}
	
    public void ChatearPaciente(){}
}
