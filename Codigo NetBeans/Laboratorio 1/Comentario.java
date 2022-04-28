import java.text.SimpleDateFormat;
import java.util.Date;

class Comentario{
	// Estado o características
	private String username;
	private String comentario;
	private Date fechaComentario;
	
    // Constructores
    public Comentario(){}
    public Comentario(String comentario,String username,Date fechaComentario){
		this.comentario=comentario;
		this.username=username;
		this.fechaComentario=fechaComentario;
    }
	
	// Getters
	public String getComentario(){
		return this.comentario;
	}
	public String getUsername(){
		return this.username;
	}
	public Date getFechaComentario(){
		return this.fechaComentario;
	}
	
	// Setters
	public void setComentario(String comentarios){
		this.comentario=comentario;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public void setFechaComentario(Date fechaComentario){
		this.fechaComentario=fechaComentario;
	}
}