abstract class Persona extends Usuario{
	
    // Estado o características
	private int DNI;
    private String nombre;
    private String apellido;
	private int edad;
	
    // Constructores
    public Persona(){}
    public Persona(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad){
        super(correo,username,password,estado);
		this.nombre=nombre;
        this.apellido=apellido;
		this.DNI=DNI;
		this.edad=edad;
    }
    // Destructores
    public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
    // Getters
    public String getNombre(){
        return this.nombre;
    }
	public String getApellido(){
		return this.apellido;
	}
	public int getDNI(){
		return this.DNI;
	}
	public int getEdad(){
		return this.edad;
	}

    // Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public void setDNI(int DNI){
		this.DNI=DNI;
	}
    public void setEdad(int edad){
        this.edad=edad;
    }
	
    // Comportamiento o Métodos
	public abstract void consultarDatosUsuario();
}