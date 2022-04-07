import java.text.SimpleDateFormat;
import java.util.Date;
abstract class Persona{
	
    // Estado o características
	private int DNI;
    private String nombre;
    private String apellido;
	private int edad;
	private Date fechaNacimiento;
	
    // Constructores
    public Persona(){}
    public Persona(String nombre,String apellido, int DNI,int edad){
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
	public Date getFechaNacimiento(){
		return this.fechaNacimiento;
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
	public void setFechaNacimiento(Date fechaNacimiento){
		this.fechaNacimiento=fechaNacimiento;
	}
	
}