
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import pe.edu.pucp.clinica.GestionMedica.dao.ChatDAO;
import pe.edu.pucp.clinica.GestionMedica.dao.ComentarioDAO;
import pe.edu.pucp.clinica.GestionMedica.dao.MedicamentoDAO;
import pe.edu.pucp.clinica.GestionMedica.mysql.ChatMySQL;
import pe.edu.pucp.clinica.GestionMedica.mysql.ComentarioMySQL;
import javax.tools.Diagnostic;
import pe.edu.pucp.clinica.GestionMedica.dao.DiagnosticoDAO;
import pe.edu.pucp.clinica.GestionMedica.dao.LineaRecetaMedicaDAO;
import pe.edu.pucp.clinica.GestionMedica.dao.MedicamentoDAO;
import pe.edu.pucp.clinica.GestionMedica.dao.PacienteDAO;
import pe.edu.pucp.clinica.GestionMedica.dao.RecetaMedicaDAO;
import pe.edu.pucp.clinica.GestionMedica.mysql.DiagnosticoMySQL;
import pe.edu.pucp.clinica.GestionMedica.mysql.LineaRecetaMedicaMySQL;
import pe.edu.pucp.clinica.GestionMedica.mysql.MedicamentoMySQL;
import pe.edu.pucp.clinica.GestionMedica.mysql.PacienteMySQL;
import pe.edu.pucp.clinica.GestionMedica.mysql.RecetaMedicaMySQL;
import pe.edu.pucp.clinica.gestioncita.model.Diagnostico;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;
import pe.edu.pucp.clinica.gestionreceta.model.LineaRecetaMedica;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;
import pe.edu.pucp.clinica.herramientas.model.Chat;
import pe.edu.pucp.clinica.herramientas.model.Comentario;
import pe.edu.pucp.clinica.gestionreceta.model.RecetaMedica;
import pe.edu.pucp.clinica.organizacion.model.Consultorio;
import pe.edu.pucp.clinica.organizacion.model.Horario;
import pe.edu.pucp.clinica.organizacion.model.HorasHorario;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.clinica.personal.model.Administrador;
import pe.edu.pucp.clinica.personal.model.Especialidad;
import pe.edu.pucp.clinica.personal.model.Medico;
import pe.edu.pucp.clinica.rrhh.dao.AdministradorDAO;
import pe.edu.pucp.clinica.rrhh.dao.ConsultorioDAO;
import pe.edu.pucp.clinica.rrhh.dao.HorarioDAO;
import pe.edu.pucp.clinica.rrhh.dao.EspecialidadDAO;
import pe.edu.pucp.clinica.rrhh.dao.HorasHorarioDAO;
import pe.edu.pucp.clinica.rrhh.dao.MedicoDAO;
import pe.edu.pucp.clinica.rrhh.dao.SemestreDAO;
import pe.edu.pucp.clinica.rrhh.mysql.AdministradorMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.ConsultorioMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.HorarioMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.EspecialidadMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.HorasHorarioMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.MedicoMySQL;
import pe.edu.pucp.clinica.rrhh.mysql.SemestreMySQL;

/**
 *
 * @author ISAI
 */
public class Main {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
        int resultado;
        
        
        // Prueba Semestre
        Semestre sem = new Semestre("NOM_SEM", sdf.parse("1-2-2022"), sdf.parse("1-12-2022"));
        SemestreDAO semDAO = new SemestreMySQL();

        resultado = semDAO.insertar(sem);
        if (resultado == 1) {
            System.out.println("Ingreso correcto del semestre");
            
            sem.setNombre("NOM_SEMESTRE");
            resultado = semDAO.modificar(sem);
            if (resultado == 1) {
                System.out.println("Modificacion correcta del semestre");

                ArrayList<Semestre> arrSemestres = semDAO.listarTodos();
                for (Semestre semi : arrSemestres) {
                    System.out.println("ID: " + semi.getId_semestre() + " - " + semi.getNombre());
                }
                
                resultado = semDAO.eliminar(sem.getId_semestre());
                if (resultado == 1) {
                    System.out.println("Eliminacion correcta del semestre");
                    
                } else {
                    System.out.println("Error al eliminar el semestre");
                }
            } else {
                System.out.println("Error al modificar el semestre");
            }
        } else {
            System.out.println("Error al ingresar el semestre");
        }
//
//        
//        // Prueba Consultorio
//        Consultorio cons1 = new Consultorio("NOM_CONSUL1");
//        ConsultorioDAO consDAO = new ConsultorioMySQL();
//
//        resultado = consDAO.insertar(cons1);
//        if (resultado == 1) {
//            System.out.println("Ingreso correcto del consultorio");
//
//            cons1.setNombre("NOM_CONSULTORIO1");
//            resultado = consDAO.modificar(cons1);
//            if (resultado == 1) {
//                System.out.println("Modificacion correcta del consultorio");
//
//                ArrayList<Consultorio> arrConsultorios = consDAO.listarTodas();
//                for (Consultorio cons : arrConsultorios) {
//                    System.out.println("ID: " + cons.getId_consultorio() + " - Nombre: " + cons.getNombre());
//                }
//
//                resultado = consDAO.eliminar(cons1.getId_consultorio());
//                if (resultado == 1) {
//                    System.out.println("Eliminacion correcta del consultorio");
//                } else {
//                    System.out.println("Error al eliminar el consultorio");
//                }
//            } else {
//                System.out.println("Error al modificar el consultorio");
//            }
//        } else {
//            System.out.println("Error al ingresar el consultorio");
//        }
//        
//        
//        // Prueba HorasHorario
//        HorasHorario hhorario1 = new HorasHorario(Time.valueOf("13:00:00"),Time.valueOf("18:00:00"));
//        HorasHorarioDAO hhorarioDAO = new HorasHorarioMySQL();
//        
//        resultado = hhorarioDAO.insertar(hhorario1);
//        if (resultado == 1) {
//            System.out.println("Ingreso correcto del HorasHorario");
//            
//            hhorario1.setHora_inicio(Time.valueOf("15:00:00"));
//            hhorario1.setHora_fin(Time.valueOf("16:00:00"));
//            resultado = hhorarioDAO.modificar(hhorario1);
//            if(resultado == 1) {
//                System.out.println("Modificacion correcta del HorasHorario");
//                
//                ArrayList<HorasHorario> arrHorasHorario = hhorarioDAO.listarTodas();
//                for (HorasHorario hhor : arrHorasHorario) {
//                    System.out.println("ID: " + hhor.getId_horasHorario()+ " - H_INI: " + hhor.getHora_inicio() + "  H_FIN: " + hhor.getHora_fin());
//                }
//                
//                resultado = hhorarioDAO.eliminar(hhorario1.getId_horasHorario());
//                if (resultado == 1) {
//                    System.out.println("Eliminacion correcta del HorasHorario");
//                } else {
//                    System.out.println("Error al eliminar el HorasHorario");
//                }
//            } else {
//                System.out.println("Error al modificar el HorasHorario");
//            }
//        } else {
//            System.out.println("Error al ingresar el HorasHorario");
//        }
//        
//        // Prueba Horario
//        HorasHorario hhorarioAux = new HorasHorario(Time.valueOf("20:00:00"),Time.valueOf("21:00:00"));
//        HorasHorario hhorarioAux2 = new HorasHorario(Time.valueOf("22:00:00"),Time.valueOf("23:00:00"));
//        hhorarioDAO.insertar(hhorarioAux); hhorarioDAO.insertar(hhorarioAux2);
//        
//        Semestre semestreAux = new Semestre("SEM_AUX", sdf.parse("1-2-2022"), sdf.parse("1-12-2022"));
//        semDAO.insertar(semestreAux);
//        
//        Especialidad esp1 = new Especialidad("Gastroenterologo",1,2);
//        esp1.setId_especialidad(1);
//        
//        Administrador adm = new Administrador(esp1,"72634611","Daniel","Rom",
//                sdf.parse("12-12-2000"),"fa@fa.com","UserName","password",1);
//        adm.setId_administrador(3);
//        
//        Medico medicoAux = new Medico(0,0,esp1,"72634611","Daniel","Rom",
//                sdf.parse("12-12-2000"),"fa@fa.com","UserName","password",1);
//        medicoAux.setAdministrador(adm);
//        
//        MedicoDAO medDAO = new MedicoMySQL();
//        medDAO.insertar(medicoAux);
//        
//        Horario horario1 = new Horario(hhorarioAux,semestreAux,"LUNES");
//        horario1.setMedico(medicoAux);
//        HorarioDAO horarioDAO = new HorarioMySQL();
//        
//        resultado = horarioDAO.insertar(horario1);
//        if (resultado == 1) {
//            System.out.println("Ingreso correcto del Horario");
//            
//            horario1.setHorasHorario(hhorarioAux2);
//            resultado = horarioDAO.modificar(horario1);
//            if(resultado == 1) {
//                System.out.println("Modificacion correcta del Horario");
//                
//                ArrayList<Horario> arrHorario = horarioDAO.listarTodas();
//                for (Horario hor : arrHorario) {
//                    System.out.println("ID: " + hor.getId_horario() + 
//                            " - FID_HH: " + hor.getHorasHorario().getId_horasHorario() + 
//                            " - FID_SEM: " + hor.getSemestre().getId_semestre() + 
//                            " - FID_MED: " + hor.getMedico().getId_medico() + 
//                            " - DIA: " + hor.getDia());
//                }
//                
//                resultado = horarioDAO.eliminar(horario1.getId_horario());
//                if (resultado == 1) {
//                    System.out.println("Eliminacion correcta del Horario");
//                } else {
//                    System.out.println("Error al eliminar el Horario");
//                }
//            } else {
//                System.out.println("Error al modificar el Horario");
//            }
//        } else {
//            System.out.println("Error al ingresar el Horario");
//        }
//        
//        
//        // Prueba Comentario
//        Comentario comentario1 = new Comentario("SOY UNA DESCRIPCION",sdf.parse("9-5-2022"));
//        comentario1.setMedico(medicoAux);
//        ComentarioDAO comentarioDAO = new ComentarioMySQL();
//        
//        resultado = comentarioDAO.insertar(comentario1);
//        if (resultado == 1) {
//            System.out.println("Ingreso correcto del Comentario");
//            
//            comentario1.setDescripcion("SOY OTRA DESCRIPCION");
//            resultado = comentarioDAO.modificar(comentario1);
//            if(resultado == 1) {
//                System.out.println("Modificacion correcta del Comentario");
//                
//                ArrayList<Comentario> arrComentario = comentarioDAO.listar();
//                for (Comentario com : arrComentario) {
//                    System.out.println("ID: " + com.getId_comentario()+ 
//                            " - DESCRIPCION: " + com.getDescripcion() + 
//                            " - FECHA: " + com.getFecha_comentario() + 
//                            " - FID_MED: " + com.getMedico().getId_medico());
//                }
//                
//                resultado = comentarioDAO.eliminar(comentario1.getId_comentario());
//                if (resultado == 1) {
//                    System.out.println("Eliminacion correcta del Comentario");
//                } else {
//                    System.out.println("Error al eliminar el Comentario");
//                }
//            } else {
//                System.out.println("Error al modificar el Comentario");
//            }
//        } else {
//            System.out.println("Error al ingresar el Comentario");
//        }
//        
//        // Prueba Chat
//        Paciente pacienteAux = new Paciente(true,"32454533","Asu","Mare",sdf.parse("9-5-2022"),"xx@xx.com","se","elimina",1);
//        pacienteAux.setId_paciente(1);
//        pacienteAux.setId_usuario(45);
//        
//        Chat chat1 = new Chat("SOY UN COMENTARIO",sdf.parse("9-5-2022"),"SOY UN EMISOR",Time.valueOf("20:42:01"));
//        chat1.setMedico(medicoAux);
//        chat1.setPaciente(pacienteAux);
//        ChatDAO chatDAO = new ChatMySQL();
//        
//        resultado = chatDAO.insertar(chat1);
//        if (resultado == 1) {
//            System.out.println("Ingreso correcto del Chat");
//            
//            chat1.setComentario("SOY OTRO COMENTARIO");
//            resultado = chatDAO.modificar(chat1);
//            if(resultado == 1) {
//                System.out.println("Modificacion correcta del Chat");
//                
//                ArrayList<Chat> arrChat = chatDAO.listar();
//                for (Chat chat : arrChat) {
//                    System.out.println("ID: " + chat.getId_chat() + 
//                            " - COMENTARIO: " + chat.getComentario() + 
//                            " - FECHA: " + chat.getFecha() + 
//                            " - EMISOR: " + chat.getEmisor() +
//                            " - HH: " + chat.getHora() +
//                            " - FID_MED: " + chat.getMedico().getId_medico() + 
//                            " - FID_PAC: " + chat.getPaciente().getId_paciente());
//                }
//                
//                resultado = chatDAO.eliminar(chat1.getId_chat());
//                if (resultado == 1) {
//                    System.out.println("Eliminacion correcta del Chat");
//                } else {
//                    System.out.println("Error al eliminar el Chat");
//                }
//            } else {
//                System.out.println("Error al modificar el Chat");
//            }
//        } else {
//            System.out.println("Error al ingresar el Chat");
//        }
        


        // Prueba Paciente
        Paciente paciente1 = new Paciente(true,"32454533","NOM_PAC","APE_PAC",sdf.parse("9-5-2022"),"AA@xx.com","US","PAS",1);
        PacienteDAO pacienteDAO = new PacienteMySQL();
        
        resultado = pacienteDAO.insertar(paciente1);
        if (resultado == 1) {
            System.out.println("Ingreso correcto del Paciente");
            
            paciente1.setNombre("SOY OTRO NOMBRE");
            resultado = pacienteDAO.modificar(paciente1);
            if(resultado == 1) {
                System.out.println("Modificacion correcta del Paciente");
                
                ArrayList<Paciente> arrPaciente = pacienteDAO.listar();
                for (Paciente pac : arrPaciente) {
                    System.out.println("ID_PAC: " + pac.getId_paciente()+ 
                            " - SGR: " + pac.getSeguro()+ 
                            " - ID_USER: " + pac.getId_usuario()+ 
                            " - NOMBRE: " + pac.getNombre()+
                            " " + pac.getApellido()+
                            "\nDNI: " + pac.getDNI()+ 
                            " - EMAIL: " + pac.getEmail());
                }
                
                resultado = pacienteDAO.eliminar(paciente1);
                if (resultado == 1) {
                    System.out.println("Eliminacion correcta del Paciente");
                } else {
                    System.out.println("Error al eliminar el Paciente");
                }
            } else {
                System.out.println("Error al modificar el Paciente");
            }
        } else {
            System.out.println("Error al ingresar el Paciente");
        }
        
        
        /*
        // Prueba Semestre
        Semestre sem = new Semestre("NOM_SEM", sdf.parse("1-2-2022"), sdf.parse("1-12-2022"));
        SemestreDAO semDAO = new SemestreMySQL();

        resultado = semDAO.insertar(sem);
        if (resultado == 1) {
            System.out.println("Ingreso correcto del semestre");
            
            sem.setNombre("NOM_SEMESTRE");
            resultado = semDAO.modificar(sem);
            if (resultado == 1) {
                System.out.println("Modificacion correcta del semestre");

                ArrayList<Semestre> arrSemestres = semDAO.listarTodos();
                for (Semestre semi : arrSemestres) {
                    System.out.println("ID: " + semi.getId_semestre() + " - " + semi.getNombre());
                }
                
                resultado = semDAO.eliminar(sem.getId_semestre());
                if (resultado == 1) {
                    System.out.println("Eliminacion correcta del semestre");
                    
                } else {
                    System.out.println("Error al eliminar el semestre");
                }
            } else {
                System.out.println("Error al modificar el semestre");
            }
        } else {
            System.out.println("Error al ingresar el semestre");
        }

        
        // Prueba Consultorio
        Consultorio cons1 = new Consultorio("NOM_CONSUL1");
        ConsultorioDAO consDAO = new ConsultorioMySQL();

        resultado = consDAO.insertar(cons1);
        if (resultado == 1) {
            System.out.println("Ingreso correcto del consultorio");

            cons1.setNombre("NOM_CONSULTORIO1");
            resultado = consDAO.modificar(cons1);
            if (resultado == 1) {
                System.out.println("Modificacion correcta del consultorio");

                ArrayList<Consultorio> arrConsultorios = consDAO.listarTodas();
                for (Consultorio cons : arrConsultorios) {
                    System.out.println("ID: " + cons.getId_consultorio() + " - Nombre: " + cons.getNombre());
                }

                resultado = consDAO.eliminar(cons1.getId_consultorio());
                if (resultado == 1) {
                    System.out.println("Eliminacion correcta del consultorio");
                } else {
                    System.out.println("Error al eliminar el consultorio");
                }
            } else {
                System.out.println("Error al modificar el consultorio");
            }
        } else {
            System.out.println("Error al ingresar el consultorio");
        }
        */
        //CODIGO FARIX DANIEL PRUEBA
//        Especialidad esp1 = new Especialidad("Neurocirujano",1,4);
//        
//        Administrador adm = new Administrador(esp1,"72634611","Daniel","Rom",
//                sdf.parse("12-12-2000"),"fa@fa.com","UserName","password",1);
//        adm.setId_administrador(3);
//        
//        Medico medico = new Medico(0,0,esp1,"72634611","Daniel","Rom",
//                sdf.parse("12-12-2000"),"fa@fa.com","UserName","password",1);
//        medico.setAdministrador(adm);
////        MedicoDAO medDAO = new MedicoMySQL();
////        medico.setId_usuario(1);
////        medico.setId_persona(1);
////        
////        resultado = medDAO.insertar(medico);
////        if (resultado==1){
////            System.out.println("SE ha ingresado un medicamento de manera correcta");
////        }
//        //PAQUETE GESTION RECETA FARIX
//        Diagnostico diag = new Diagnostico();
////        diag.getCitaMedica();
////        DiagnosticoDAO diagDao= new DiagnosticoMySQL();
////        diagDao.insertar(diag);
////        
//        
//        Medicamento medicamento1 = new Medicamento("IBUFOX20","IBUPROFENO 20 mg");
//        System.out.println("Medicamento: " + medicamento1.getNombre()+" - "+ medicamento1.getCodigo());
//        MedicamentoDAO medicamento1DAO = new MedicamentoMySQL();
//        resultado = medicamento1DAO.insertar(medicamento1);
//        if(resultado ==1){
//            System.out.println("SE ha ingresado un medicamento de manera correcta");
//        }
//        RecetaMedicaDAO recetaMedicaDao = new RecetaMedicaMySQL();
//        
//        
//        RecetaMedica receta = new RecetaMedica("Receta DX2",diag);
//        receta.getDiagnostico().setId_diagnostico(2);
//        resultado = recetaMedicaDao.insertar(receta);
//        if(resultado ==1){
//            System.out.println("SE ha ingresado una receta de manera correcta");
//        }
//        LineaRecetaMedica lineaRec1 = new LineaRecetaMedica(20,receta,medicamento1);
//        LineaRecetaMedicaDAO lineadao = new LineaRecetaMedicaMySQL();
//        resultado = lineadao.insertar(lineaRec1);
//        if(resultado ==1){
//            System.out.println("SE ha ingresado una linea de receta de manera correcta");
//        }
//        ArrayList<LineaRecetaMedica> arrLineas = lineadao.listar();
//        for(LineaRecetaMedica lin:arrLineas){
//            System.out.println("ID: " + lin.getIdLinea()+ " - " + lin.getCantidad()+ " - " + lin.getMedicamento().getId_medicamento());
//        } 
//        
        //CODIGO ISAI
        
//        //-prueba de especialidad
//        EspecialidadDAO especiDAO = new EspecialidadMySQL();
//        resultado = especiDAO.insertar(esp1);
//        if(resultado == 1){
//            System.out.println("Se realizo el ingreso correcto de especialidad.");
//        }
//        else{
//            System.out.println("Fallo al ingresar el especialidad");
//        }
//        resultado = especiDAO.modificar(esp1);
//        if(resultado == 1){
//            System.out.println("Se realizo la modificacion correcta de especialidad.");
//        }
//        else{
//            System.out.println("Fallo al modificar el especialidad");
//        }
//        resultado = especiDAO.eliminar(esp1.getId_especialidad());
//        if(resultado == 1){
//            System.out.println("Se realizo la eliminacion correcta de especialidad.");
//        }
//        else{
//            System.out.println("Fallo al eliminar el especialidad");
//        }
//        //-prueba de administradores
//        AdministradorDAO administradorDAO = new AdministradorMySQL();
//        resultado = administradorDAO.insertar(adm);
//        if(resultado == 1){
//            System.out.println("Se realizo el ingreso correcto del administrador.");
//        }
//        else{
//            System.out.println("Fallo al ingresar el administrador");
//        }
//        resultado = administradorDAO.modificar(adm);
//        if(resultado == 1){
//            System.out.println("Se realizo la modificacion correcta del administrador.");
//        }
//        else{
//            System.out.println("Fallo al modificar el administrador");
//        }
//        resultado = administradorDAO.eliminar(adm.getId_administrador());
//        if(resultado == 1){
//            System.out.println("Se realizo la eliminacion correcta del administrador.");
//        }
//        else{
//            System.out.println("Fallo al eliminar el administrador");
//        }
//        
//         ArrayList<Administrador> arrAdministradores = administradorDAO.listarTodas();
//        for(Administrador admi:arrAdministradores){
//            System.out.println("ID: " + admi.getId_administrador() + " - " + admi.getNombre());
//        } 
        
        
        
        
//        //probamos el ingreso de medicamentos
//        Medicamento medicamento1 = new Medicamento("original","copia de la copia");
//        System.out.println("Medicamento: " + medicamento1.getNombre()+" - "+ medicamento1.getComentario());
//        MedicamentoDAO medicamento1DAO = new MedicamentoMySQL();
//         resultado = medicamento1DAO.insertar(medicamento1);
//        if(resultado ==1){
//            System.out.println("SE ha ingresado un medicamento de manera correcta");
//        }
//        else{
//            System.out.println("Error al registrar el medicamento");
//        }
//        
//        //prueba de modificar 
//        medicamento1.setNombre("cambiado");
//        medicamento1.setComentario("Se esta cambiando");
//        System.out.println("ID : "+ medicamento1.getCodigo());
//        resultado = medicamento1DAO.modificar(medicamento1);
//        if(resultado ==1){
//            System.out.println("SE ha modificado un medicamento de manera correcta");
//        }
//        else{
//            System.out.println("Error al modificar el medicamento");
//        }
//        
//        //prueba de eliminacion
//        resultado = medicamento1DAO.eliminar(medicamento1);
//        if(resultado ==1){
//            System.out.println("Se ha eliminado un medicamento de manera correcta");
//        }
//        else{
//            System.out.println("Error al eliminar el medicamento");
//        }
//        
//        //prueba de listar
//        ArrayList<Medicamento> arrMedicamentos = medicamento1DAO.listar();
//        for(Medicamento medi:arrMedicamentos){
//            System.out.println("ID: " + medi.getCodigo() + " - " + medi.getNombre() + " - " + medi.getComentario());
//        } 
//        
//        
//        //probamos con un semestre
//        Semestre sem = new Semestre ("primero", sdf.parse("1-2-2022"), sdf.parse("1-12-2022"));
//        SemestreDAO semDAO = new SemestreMySQL();
//        
//       resultado = semDAO.insertar(sem);
//       if(resultado==1){
//           System.out.println("Ingreso correcto del semestre");
//           sem.setNombre("otro nombre");
//           resultado = semDAO.modificar(sem);
//           if(resultado==1){
//               System.out.println("Modificacion correcto del semestre");
//               
//               resultado = semDAO.eliminar(sem.getId_semestre());
//               if(resultado==1){
//                    System.out.println("Eliminacion correcto del semestre");
//                    ArrayList<Semestre> arrSemestres = semDAO.listarTodos();
//                    for(Semestre semi:arrSemestres){
//                        System.out.println("ID: " + semi.getId_semestre()+ " - " + semi.getNombre());
//                    } 
//                }
//               else{
//                   System.out.println("Fallo fatal eliminar XXXXXXX");
//               }
//           }
//           else{
//               System.out.println("Fallo fatal modi XXXXXXX");
//           }
//       }
//       else{
//           System.out.println("Fallo fatal insert XXXXXXX");
//       }
       
        
    }
}

