package pe.edu.pucp.clinica.herramientas.model;
import java.sql.Time;
import java.util.Date;
public class Comentario {
    public static int i=1;
    private int id_comentario;
    private String descripcion;
    private Date fecha_comentario;
    private Medico medicos;
    
    // CONSTRUCTORES
    public Comentario(){}

    public Comentario(String descripcion, Date fecha_comentario) {
        this.descripcion = descripcion;
        this.fecha_comentario = fecha_comentario;
        this.id_comentario=i;
        i++;
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
    

}
