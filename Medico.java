class Medico extends Persona{
	
    // Estado o características
    private float calificacion;
    private int cantPacientes;
    private int codMedico;
	
    // Constructores
    public Medico(){}
    public Medico(String correo,String username,String password,String estado,String nombre,String apellido, int DNI,int edad,float calificacion,int cantPacientes,int codMedico){
        super(correo,username,password,estado,nombre,apellido,DNI,edad);
        this.calificacion=calificacion;
        this.cantPacientes=cantPacientes;
        this.codMedico = codMedico;
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
    

    // Setters
    public void setSeguro(float calificacion){
        this.calificacion=calificacion;
    }
    public void setCodPaciente(int cantPacientes){
        this.cantPacientes=cantPacientes;
    }
    public void setCodMedico(int codMedico){
        this.codMedico=codMedico;
    }
	
    // Comportamiento o Métodos
    @Override
    public String consultarDatosUsuario(){
        return "Nro. Medico: "+ this.codMedico + " Nombre: "+ getNombre()+ getApellido() +" - "+getCorreo();
    }
}
