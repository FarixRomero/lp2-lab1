import java.util.ArrayList;
class Sistema{
	private ArrayList <Usuario> usuarios;
	
	public Sistema(){
		usuarios = new ArrayList<>();
	}
	public ArrayList <Usuario> getUsuario(){
		return usuarios;
	}
	public void setUsuario(ArrayList <Usuario> usuarios){
		this.usuarios = usuarios;
	}
}