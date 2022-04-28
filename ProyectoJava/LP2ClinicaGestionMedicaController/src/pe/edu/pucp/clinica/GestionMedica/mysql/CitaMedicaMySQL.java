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
    private CallableStatement cs;
    
    //Se programan los metodos
    @Override
    public int insertar(CitaMedica citaMedica) {
        
        /*int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_CITA_MEDICA(?,?,?,?,?)}");
            cs.registerOutParameter("_id_cita", java.sql.Types.INTEGER);
            cs.setInt("_fid_paciente", (citaMedica.getPaciente()).getCodPaciente());
            cs.setInt("_fid_horario", (citaMedica.getPaciente()).getCodPaciente());
            cs.setInt("_fid_consultorio", (citaMedica.getPaciente()).getCodPaciente());
            cs.setDate("_fecha", new java.sql.Date(citaMedica.getFecha().getTime()));
            cs.executeUpdate();
            citaMedica.setCodigo(cs.getInt("_id_cita"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
        */
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

}

    @Override
    public ArrayList<CitaMedica> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(CitaMedica citaMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(CitaMedica citaMedica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
