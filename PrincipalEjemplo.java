import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
class PrincipalEjemplo{
	public static void main(String[] args) throws Exception{
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
       
       
        Paciente pac1 = new Paciente("CORREO","Farix Romero","JAVOSFOREVER","Activo","Farix","Romero",72634617,69,true,20192222);
        System.out.println(pac1.consultarDatosUsuario());

    }
}