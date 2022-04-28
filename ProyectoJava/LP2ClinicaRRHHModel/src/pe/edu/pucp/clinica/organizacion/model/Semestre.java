package pe.edu.pucp.clinica.organizacion.model;
import java.util.Date;
public class Semestre {   
    private int id_semestre;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    public Semestre(){};
    public Semestre(int id_semestre, String nombre, Date fecha_inicio, Date fecha_fin) {
        this.id_semestre = id_semestre;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getId_semestre() {
        return id_semestre;
    }

    public void setId_semestre(int id_semestre) {
        this.id_semestre = id_semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
