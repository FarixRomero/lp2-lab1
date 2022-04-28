package pe.edu.pucp.clinica.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import pe.edu.pucp.clinica.GestionMedica.dao.MedicamentoDAO;
import pe.edu.pucp.clinica.GestionMedica.mysql.MedicamentoMySQL;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;
import pe.edu.pucp.clinica.personal.model.Administrador;
import pe.edu.pucp.clinica.personal.model.Especialidad;
import pe.edu.pucp.clinica.personal.model.Medico;

public class Principal {
    public static void main(String[] args) throws Exception{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //Instanciamos sujetos de prueba
        Especialidad esp1 = new Especialidad("Cardiologia",1, 2);
        //SE instancia un medico
        Medico med1 = new Medico(4.5, 5, esp1, "12345678","Farix", 
                            "Centeno", 20, sdf.parse("13-04-2022"), 
                            "camilatorres@pucp.edu.pe", "isaiBr", "PedroHacks",1);
        //Se instancia un paciente
        Paciente pac1 = new Paciente("987654321", "Angie", "Romero",20,
                sdf.parse("30-05-2021"),"isaibravo@pucp.edu.pe", "PedroYataco", 
            "CaMiLaToRrEs", 1, true);
        //Se instancia un administrador
        Administrador adm1 = new Administrador(4.5, esp1, 10, "555-0505",
                        "Isai", "Yataco Torres",23, sdf.parse("13-04-2020"),
                        "farixRomero@pucp.edu.pe","CamilaTor", "AngieC++", 
                                1);
        
        System.out.println("Medico: " + med1.getNombre() + " "+med1.getApellido() +
                " - " + med1.getEspecialidad().getNombre());
        System.out.println("Paciente: " + pac1.getNombre() + " "+pac1.getApellido());
        System.out.println("Administrador: " + adm1.getNombre() + " "+adm1.getApellido());
        
        //probamos el ingreso de medicamentos
        System.out.println("Hola");
        Medicamento medicamento1 = new Medicamento("QUIERO MORIR","DUERMEEE");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Medicamento: " + medicamento1.getNombre()+" - "+ medicamento1.getComentario());
        MedicamentoDAO medicamento1DAO = new MedicamentoMySQL();
        int resultado = medicamento1DAO.insertar(medicamento1);
        if(resultado ==1){
            System.out.println("SE ha ingresado un medicamento de manera correcta");
        }
        else{
            System.out.println("Error al registrar el medicamento");
        }
        System.out.println("Hola");
    }
}
