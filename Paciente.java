class Paciente extends Persona{
	// Estado o características
	private boolean seguro;
	private int codPaciente;
	
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
	
	@Override
    // Comportamiento o Métodos
	public void consultarDatosUsuario(){
		
	}
}