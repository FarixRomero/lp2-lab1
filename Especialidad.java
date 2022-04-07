class Especialidad{
	
	// Estado o características;
	private String codigoEspecialidad;
    private String nombreEspecialidad;
	
    // Constructores
    public Especialidad(){}
    public Especialidad(String codigoEspecialidad,String nombreEspecialidad){
		this.codigoEspecialidad=codigoEspecialidad;
		this.nombreEspecialidad=nombreEspecialidad;
    }
    // Destructores
    public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
    // Getters
    public String getCodigoEspecialidad(){
        return this.codigoEspecialidad;
    }
    public String getNombreEspecialidad(){
        return this.nombreEspecialidad;
    }

    // Setters
    public void setCodigoEspecialidad(String codigoEspecialidad){
        this.codigoEspecialidad=codigoEspecialidad;
    }
	public void setNombreEspecialidad(String nombreEspecialidad){
        this.nombreEspecialidad=nombreEspecialidad;
    }
	
}