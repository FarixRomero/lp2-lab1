/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import pe.edu.pucp.clinica.GestionMedica.dao.MedicamentoDAO;
import pe.edu.pucp.clinica.GestionMedica.mysql.MedicamentoMySQL;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;
import pe.edu.pucp.clinica.organizacion.model.Consultorio;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.clinica.personal.model.Administrador;
import pe.edu.pucp.clinica.personal.model.Especialidad;
import pe.edu.pucp.clinica.personal.model.Medico;
import pe.edu.pucp.clinica.rrhh.dao.ConsultorioDAO;
import pe.edu.pucp.clinica.rrhh.dao.SemestreDAO;
import pe.edu.pucp.clinica.rrhh.mysql.ConsultorioMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.SemestreMySQL;

/**
 *
 * @author ISAI
 */
public class Main {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        //probamos el ingreso de medicamentos
        Medicamento medicamento1 = new Medicamento("original","copia de la copia");
        System.out.println("Medicamento: " + medicamento1.getNombre()+" - "+ medicamento1.getComentario());
        MedicamentoDAO medicamento1DAO = new MedicamentoMySQL();
        int resultado = medicamento1DAO.insertar(medicamento1);
        if(resultado ==1){
            System.out.println("SE ha ingresado un medicamento de manera correcta");
        }
        else{
            System.out.println("Error al registrar el medicamento");
        }
        
        //prueba de modificar 
        medicamento1.setNombre("cambiado");
        medicamento1.setComentario("Se esta cambiando");
        System.out.println("ID : "+ medicamento1.getCodigo());
        resultado = medicamento1DAO.modificar(medicamento1);
        if(resultado ==1){
            System.out.println("SE ha modificado un medicamento de manera correcta");
        }
        else{
            System.out.println("Error al modificar el medicamento");
        }
        
        //prueba de eliminacion
        resultado = medicamento1DAO.eliminar(medicamento1);
        if(resultado ==1){
            System.out.println("Se ha eliminado un medicamento de manera correcta");
        }
        else{
            System.out.println("Error al eliminar el medicamento");
        }
        
        //prueba de listar
        ArrayList<Medicamento> arrMedicamentos = medicamento1DAO.listar();
        for(Medicamento medi:arrMedicamentos){
            System.out.println("ID: " + medi.getCodigo() + " - " + medi.getNombre() + " - " + medi.getComentario());
        } 
        
        
        //probamos con un semestre
        Semestre sem = new Semestre ("primero", sdf.parse("1-2-2022"), sdf.parse("1-12-2022"));
        SemestreDAO semDAO = new SemestreMySQL();
        
       resultado = semDAO.insertar(sem);
       if(resultado==1){
           System.out.println("Ingreso correcto del semestre");
           sem.setNombre("otro nombre");
           resultado = semDAO.modificar(sem);
           if(resultado==1){
               System.out.println("Modificacion correcto del semestre");
               
               resultado = semDAO.eliminar(sem.getId_semestre());
               if(resultado==1){
                    System.out.println("Eliminacion correcto del semestre");
                    ArrayList<Semestre> arrSemestres = semDAO.listarTodos();
                    for(Semestre semi:arrSemestres){
                        System.out.println("ID: " + semi.getId_semestre()+ " - " + semi.getNombre());
                    } 
                }
               else{
                   System.out.println("Fallo fatal eliminar XXXXXXX");
               }
           }
           else{
               System.out.println("Fallo fatal modi XXXXXXX");
           }
       }
       else{
           System.out.println("Fallo fatal insert XXXXXXX");
       }
       
        
    }
}
