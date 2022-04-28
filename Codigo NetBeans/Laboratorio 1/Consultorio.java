import java.util.ArrayList;
class Consultorio{
	private int numConsultorio;
	private boolean disponible;
	private ArrayList<CitaMedica> citas;
	
	public Consultorio(){
		citas = new ArrayList<>();
	}
	public Consultorio(int numConsultorio, boolean disponible){
		this.numConsultorio = numConsultorio;
		this.disponible = disponible;
		citas = new ArrayList<>();
	}
	
	//Setters y getters
	public int getNumConsultorio(){
		return numConsultorio;
	}
	public void setNumConsultorio(int numConsultorio){
		this.numConsultorio = numConsultorio;
	}
	
	public boolean getDisponible(){
		return disponible;
	}
	public void setDisponible(boolean disponible){
		this.disponible = disponible;
	}
	
	public ArrayList<CitaMedica> getCitas(){
		return citas;
	}
	public void setCitas(ArrayList<CitaMedica> citas){
		this.citas = citas;
	}
	
}