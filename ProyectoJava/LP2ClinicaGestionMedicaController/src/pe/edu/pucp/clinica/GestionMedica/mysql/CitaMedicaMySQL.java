/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.GestionMedica.dao.CitaMedicaDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestioncita.model.CitaMedica;

/**
 *
 * @author ISAI
 */
public class CitaMedicaMySQL implements CitaMedicaDAO {
    
    //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    //Se programan los metodos
    @Override
    public int insertar(CitaMedica citaMedica) {
        
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_CITA_MEDICA(?,?,?,?,?)}");
            cs.registerOutParameter("_id_cita", java.sql.Types.INTEGER);
            cs.setInt("_fid_paciente", (citaMedica.getPaciente()).getIdPaciente());
            cs.setInt("_fid_horario", citaMedica.getHorario().getId_horario());
            cs.setInt("_fid_consultorio",citaMedica.getConsultorio().getId_consultorio());
            cs.setDate("_fecha", new java.sql.Date(citaMedica.getFecha().getTime()));
            cs.executeUpdate();
            citaMedica.setId_cita(cs.getInt("_id_cita"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;

    }

    @Override
    public int modificar(CitaMedica citaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_CITA_MEDICA(?,?,?,?,?)}");
            cs.setInt("_id_cita", citaMedica.getId_cita());
            cs.setInt("_fid_paciente", (citaMedica.getPaciente()).getIdPaciente());
            cs.setInt("_fid_horario", citaMedica.getHorario().getId_horario());
            cs.setInt("_fid_consultorio",citaMedica.getConsultorio().getId_consultorio());
            cs.setDate("_fecha", new java.sql.Date(citaMedica.getFecha().getTime()));
            cs.executeUpdate();
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int eliminar(CitaMedica citaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_CITA_MEDICA(?)}");
            cs.setInt("_id_cita", citaMedica.getId_cita());
            cs.executeUpdate();
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }
    
    @Override
    public ArrayList<CitaMedica> listar() {
        ArrayList<CitaMedica> citaMedica= new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_MEDICAMENTOS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                CitaMedica cm = new CitaMedica();
                cm.setId_cita(rs.getInt("id_cita"));
                cm.getPaciente().setIdPaciente(rs.getInt("fid_paciente"));
                cm.getHorario().setId_horario(rs.getInt("fid_horario"));
                cm.getConsultorio().setId_consultorio(rs.getInt("fid_consultorio"));
                cm.setFecha(rs.getDate("fecha"));
                citaMedica.add(cm);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return citaMedica;
    }
}   
   
   
