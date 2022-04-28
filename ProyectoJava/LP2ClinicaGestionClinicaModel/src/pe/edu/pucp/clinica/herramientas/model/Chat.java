package pe.edu.pucp.clinica.herramientas.model;
import java.sql.Time;
import java.util.Date;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;
import pe.edu.pucp.clinica.personal.model.Medico;

public class Chat {
    private int id_chat;
    private String comentario;
    private Date fecha;
    private String emisor;
    private Time hora;
    private Medico medicos;
    private Paciente paciente;
    
    // CONSTRUCTORES
    public Chat(){}

    public Chat(String comentario, Date fecha, String emisor, Time hora) {
        this.comentario = comentario;
        this.fecha = fecha;
        this.emisor = emisor;
        this.hora = hora;
    }
    
    // GETTERS Y SETTERS
    public int getId_chat() {
        return id_chat;
    }

    public void setId_chat(int id_chat) {    
        this.id_chat = id_chat;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
}
