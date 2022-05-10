package pe.edu.pucp.clinica.herramientas.model;
import java.sql.Time;
import java.util.Date;
import pe.edu.pucp.clinica.personal.model.Medico;

public class Comentario {
    private int id_comentario;
    private String descripcion;
    private Date fecha_comentario;
    private Medico medico;

    // CONSTRUCTORES
    public Comentario(){}
    public Comentario(String descripcion, Date fecha_comentario) {
        this.descripcion = descripcion;
        this.fecha_comentario = fecha_comentario;
    }
    
    // GETTERS Y SETTERS
    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_comentario() {
        return fecha_comentario;
    }

    public void setFecha_comentario(Date fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
