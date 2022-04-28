package pe.edu.pucp.clinica.herramientas.model;
import java.sql.Time;
import java.util.Date;
public class Chat {
    public static int i=1;
    private int id_chat;
    private String comentario;
    private Date fecha;
    private String emisor;
    private Time hora;
    private Medicos medicos;
    private Paciente paciente;
    
    // CONSTRUCTORES
    public Chat(){}

    public Chat(String comentario, Date fecha, String emisor, Time hora) {
        this.comentario = comentario;
        this.fecha = fecha;
        this.emisor = emisor;
        this.hora = hora;
        this.id_chat=i;
        i++;
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
