import java.sql.Time;
import java.util.Date;

class Chat {
	private Medico medico;
	private Paciente paciente;

	// Estado o características
	private String comentario; 
	private Date fecha;
	private Time tiempo;
	private String emisor;
    // Constructores
    public Chat(){}
    public Chat(String comentario,Date fecha , Time tiempo , String emisor ){
        this.comentario = comentario;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.emisor = emisor;
    }
	
    // Getters
    public String getComentario(){
        return this.comentario;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public Time getTiempo(){
        return this.tiempo;
    }

}