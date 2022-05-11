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
import pe.edu.pucp.clinica.GestionMedica.dao.HistorialClinicoDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestioncita.model.HistorialClinico;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;

/**
 *
 * @author ISAI
 */
public class HistorialClinicoMySQL implements HistorialClinicoDAO {

    //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    @Override
    public int insertar(HistorialClinico historialClinico) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_HISTORIAL_CLINICO(?,?)}");
            cs.registerOutParameter("_id_historia", java.sql.Types.INTEGER);
            cs.setInt("_fid_paciente",historialClinico.getPaciente().getId_paciente());
            cs.executeUpdate();
            historialClinico.setNroHistoria(cs.getInt("_id_historia"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(HistorialClinico historialClinico) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_HISTORIAL_CLINICO(?,?)}");
            cs.setInt("_id_historia", historialClinico.getNroHistoria());
            cs.setInt("_fid_paciente",historialClinico.getPaciente().getId_paciente());
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
    public int eliminar(HistorialClinico historialClinico) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_HISTORIAL_CLINICO(?)}");
            cs.setInt("_id_historia", historialClinico.getNroHistoria());
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
    public ArrayList<HistorialClinico> listar() {
        ArrayList<HistorialClinico> historialClinico = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_MEDICAMENTOS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                HistorialClinico hc = new HistorialClinico();
                hc.setNroHistoria(rs.getInt("id_historia"));
                hc.getPaciente().setId_paciente(rs.getInt("fid_paciente"));
                historialClinico.add(hc);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return historialClinico;
    }
    
}
