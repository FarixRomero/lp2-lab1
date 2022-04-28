abstract class Usuario extends Persona{
	
    // Estado o características
    private String correo;
    private String username;
	private String password;
	private String estado;
	
    // Constructores
    public Usuario(){}
    public Usuario(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad){
        super(nombre,apellido,DNI,edad);
		this.correo=correo;
		this.username=username;
		this.password=password;
		this.estado=estado;
    }
    // Destructores
    public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
    // Getters
    public String getCorreo(){
		return this.correo;
	}
	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
	public String getEstado(){
		return this.estado;
	}
	
    // Setters
    public void setCorreo(String correo){
		this.correo=correo;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}
	
    // Comportamiento o Métodos
	public String consultarDatosUsuario(){
		// Devuelve la data de el usuario
		return " ";
	}
	
	public abstract void Login();
	public abstract void RecuperarPassword();
	public abstract void ModificarDatos();
	public abstract void GestionarCitas();

}