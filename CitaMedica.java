import java.text.SimpleDateFormat;
import java.util.Date;

class CitaMedica {
	private String codigo;
	private String estado;
	private Date fecha;
	
	private Medico medico;
	private Paciente paciente;
	
	//Constructor
	public CitaMedica(){}
	public CitaMedica (String codigo, String estado, Medico medico, Paciente paciente) {
		this.codigo = codigo;
		this.estado = estado;
                this.medico = medico;
                this.paciente = paciente;
	}
	
	//Setters
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setFecha (Date fecha) {
		this.fecha = fecha;
	}
	public void setMedico (Medico medico) {
		this.medico = medico;
	}
	public void setPaciente (Paciente paciente) {
		this.paciente = paciente;
	}
	
	//Getters
	public String getCodigo() {
		return codigo;
	}
	public String getEstado() {
		return estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public Medico getMedico () {
		return medico;
	}
	public Paciente getPaciente () {
		return paciente;
	}
	
	//Metodos
	public String obtenerDatosCita() {
            return "La cita de codigo: " + getCodigo() + " es del paciente: " + paciente.getNombre() + " con el medico: " + medico.getNombre();
	}		
	
}
