class Diagnostico{
	//Atributos
	private String resultado;
	private String observacion;
	private RecetaMedica recetas;
	
	//Constructores
	public Diagnostico(){};
	public Diagnostico(String resultado, String observacion){
		this.resultado = resultado;
		this.observacion = observacion;
	}
	
	//Setters y getters
	public String getResultado(){
		return resultado;
	}
	public void setResultado(String resultado){
		this.resultado = resultado;
	}
	
	public String getObservacion(){
		return observacion;
	}
	public void setObservacion(String observacion){
		this.observacion = observacion;
	}

}