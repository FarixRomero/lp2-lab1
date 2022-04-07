import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
class PrincipalEjemplo{
	public static void main(String[] args) throws Exception{
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
       
       
        Paciente pac1 = new Paciente("CORREO","Farix Romero","JAVOSFOREVER","Activo","Farix","Romero",72634617,69,true,20192222);
        System.out.println(pac1.consultarDatosUsuario());
		

	Medico med1 = new Medico("CORREO","Juan Perez","JAVOLOVER","Activo","Juan","Perez",1234567,420,0.0F,0,11111);
        System.out.println(med1.consultarDatosUsuario());
        
        CitaMedica cita1 = new CitaMedica("INF101","PROGRAMADA",med1,pac1);
        System.out.println(cita1.obtenerDatosCita());

    }
}
