/*
 * Para esta solución, Médico y Paciente se convierten en interfaces
 */

class CitaMedica implements Medico, Paciente{
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
		System.out.println(Medico.super.obtenerDatos());
		System.out.println(Paciente.super.obtenerDatos());
	}		
	
}