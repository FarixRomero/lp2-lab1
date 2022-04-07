import java.util.ArrayList;
class HistorialClinico{
	//atributos
	private int nroHistoria;
	private ArrayList<Diagnostico> diagnosticos;
	
	//constructores
	public HistorialClinico(){}
	public HistorialClinico(int nroHistoria){
		this.nroHistoria = nroHistoria;
		diagnosticos = new ArrayList<>();
	}
	
	//destructores
	public void finalize(){
        System.out.println("El objeto se esta destruyendo");
    }
	
	//metodos
	public int getNroHistoria(){
		return nroHistoria;
	}
	public void setNroHistoria(int nroHistoria){
		this.nroHistoria = nroHistoria;
	}
	
	public ArrayList<Diagnostico> getDiagnostico(){
		return diagnosticos;
	}
	public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos){
		this.diagnosticos = diagnosticos;
	}

}