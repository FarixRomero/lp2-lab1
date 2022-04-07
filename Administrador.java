public class Administrador extends Usuario {
    private int codigo;
    Medico RelacionMedicos[];//relación de medicos que administra
    Public Administrador(){
    }
    Public Administrador(int codigo,String Correo,String Username,String Password, String Nombre, int DNI){
    }	
    void SetCodigo(int codigo){
        this.codigo=codigo;
    }
    int GetCodigo(){
        return codigo;
    }
    void GenerarListaPacientes(){
    
    }
    void GestionarUsuarios(){
        /*codigo*/
    }
    void GestionarMedicos(){
        /*codigo*/
    }
    void GestionarConsultorios(){
        /*codigo*/
    }

    void GestionarMedicamentos(){
        /*codigo*/
    }
    @Override
    public void CrearCuenta(String correo,String username,String password, Medico ListaMedicos[]){	
	}
    @Override
	public void Login(String correo,String password){
	}
    @Override
	public void RecuperarPassword(){
	}
    @Override
	public void ModificarDatos(){
	}
    @Override
	public void GestionarCitas(){
	}
   
}
