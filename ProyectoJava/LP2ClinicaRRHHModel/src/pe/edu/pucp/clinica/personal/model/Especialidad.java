package pe.edu.pucp.clinica.personal.model;
public class Especialidad {
    public static int i=1;
    private int id_especialidad;
    private String nombre;
    private int estado;
    private int cant_medicos = 0;
    
    // CONSTRUCTORES
    public Especialidad(){}
    public Especialidad(String nombre, int estado, int cant_medicos) {
        this.nombre = nombre;
        this.estado = estado;
        this.cant_medicos=cant_medicos;
        this.id_especialidad=i;
        i++;
    }
    
    // GETTERS Y SETTERS
    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCant_medicos() {
        return cant_medicos;
    }

    public void setCant_medicos(int cant_medicos) {
        this.cant_medicos = cant_medicos;
    }
}

