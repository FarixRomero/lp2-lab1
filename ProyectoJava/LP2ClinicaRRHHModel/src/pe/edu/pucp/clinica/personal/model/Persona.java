
package pe.edu.pucp.clinica.personal.model;
import java.util.Date;

abstract public class Persona {
    public static int i=1;
    private int id_persona;
    private String DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fecha_nacimiento;

    // CONSTRUCTORES
    public Persona() {}
    public Persona(String DNI, String nombre, String apellido, int edad, Date fecha_nacimiento) {
        this.id_persona=i;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        i++;
    }
    
    // GETTERS Y SETTERS

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
}
