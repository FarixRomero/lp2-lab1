/*
 * Para esta solución, se crean interfaces aparte para Medico y Paciente
 */

interface IMedico {
	String mostrarMedico();
}

interface IPaciente {
	String mostrarPaciente();
}


class CitaMedica implements IMedico, IPaciente{
	private String codigo;
	private int estado;
	
	//Constructor
	public CitaMedica(){}
	public CitaMedica (String codigo, int estado) {
		this.codigo = codigo;
		this.estado = estado;
	}
	
	//Setters
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	//Getters
	public String getCodigo() {
		return codigo;
	}
	public int getEstado() {
		return estado;
	}
	
	//Metodos
	@Override
	public void obtenerDatos() {
		System.out.println("Datos de la cita: \n");
		System.out.println(IMedico.mostrarMedico());
		System.out.println(IPaciente.mostrarPaciente());
	}		
	
}