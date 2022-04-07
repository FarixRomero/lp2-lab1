import java.util.ArrayList;
class RecetaMedica{
	private ArrayList<Medicamento> medicamentos;
	
	public RecetaMedica(){
		medicamentos = new ArrayList<>();
	}
	
	public ArrayList<Medicamento> getMedicamentos(){
		return medicamentos;
	}
	public void setMedicamentos(ArrayList<Medicamento>medicamentos){
		this.medicamentos = medicamentos;
	}
}