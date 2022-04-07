import java.util.Date;
class Semestre{
	private int semestre;
	private String nombre;
	private Date fechaInicio;
	private	Date fechaFin;
	
	public int getSemestre(){
		return semestre;
	}
	public void setSemestre(int semestre){
		this.semestre = semestre;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public Date getFechaInicio(){
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio){
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin(){
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin){
		this.fechaFin = fechaFin;
	}
}