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
import pe.edu.pucp.clinica.GestionMedica.dao.DiagnosticoDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestioncita.model.CitaMedica;
import pe.edu.pucp.clinica.gestioncita.model.Diagnostico;
import pe.edu.pucp.clinica.gestioncita.model.HistorialClinico;

/**
 *
 * @author ISAI
 */
public class DiagnosticoMySQL implements DiagnosticoDAO {

    //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(Diagnostico diagnostico) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_DIAGNOSTICO(?,?,?,?,?)}");
            cs.registerOutParameter("_id_diagnostico", java.sql.Types.INTEGER);
            cs.setInt("_fid_cita", diagnostico.getCitaMedica().getId_cita());
            cs.setInt("_fid_historia", diagnostico.getHistorialClinico().getNroHistoria());
            cs.setString("_resultado", diagnostico.getResultado());
            cs.setString("_observacion", diagnostico.getObservacion());
            cs.executeUpdate();
            diagnostico.setId_diagnostico(cs.getInt("_id_diagnostico"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Diagnostico diagnostico) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_DIAGNOSTICO(?,?,?,?,?)}");
            cs.setInt("_id_diagnostico", diagnostico.getId_diagnostico());
            cs.setInt("_fid_cita", diagnostico.getCitaMedica().getId_cita());
            cs.setInt("_fid_historia", diagnostico.getHistorialClinico().getNroHistoria());
            cs.setString("_resultado", diagnostico.getResultado());
            cs.setString("_observacion", diagnostico.getObservacion());
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
    public int eliminar(Diagnostico diagnostico) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_DIAGNOSTICO(?)}");
            cs.setInt("_id_diagnostico", diagnostico.getId_diagnostico());
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public ArrayList<Diagnostico> listar() {
        ArrayList<Diagnostico> diagnostico= new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_DIAGNOSTICO_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                Diagnostico diag = new Diagnostico();
                diag.setId_diagnostico(rs.getInt("id_diagnostico"));
                diag.setCitaMedica(new CitaMedica());
                diag.getCitaMedica().setId_cita(rs.getInt("fid_cita"));
                diag.setHistorialClinico(new HistorialClinico());
                diag.getHistorialClinico().setNroHistoria(rs.getInt("fid_historia"));
                diag.setResultado(rs.getString("resultado"));
                diag.setObservacion(rs.getString("observacion"));
                diag.getCitaMedica().setFecha(rs.getDate("fecha"));
                diagnostico.add(diag);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return diagnostico;
    }
}
