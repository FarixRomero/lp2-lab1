/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.personal.model.Especialidad;
import pe.edu.pucp.clinica.rrhh.dao.EspecialidadDAO;

/**
 *
 * @author ISAI
 */
public class EspecialidadMySQL implements EspecialidadDAO{
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    
    @Override
    public ArrayList<Especialidad> listarTodas() {
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        try{
         con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call LISTAR_ESPECIALIDAD_TODOS()}");
         rs = cs.executeQuery();
         while(rs.next()){
                Especialidad esp = new Especialidad();
                esp.setId_especialidad(rs.getInt("id_administrador"));
                esp.setNombre(rs.getString("nombre"));
                esp.setCant_medicos(rs.getInt("cant_medicos"));
                especialidades.add(esp);
        }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return especialidades;
    }

    @Override
    public int insertar(Especialidad especialidad) {
        int resultado=0;
        try{
            con = DBManager.getInstance().getConnection();
            
            cs = con.prepareCall("{call INSERTAR_ESPECIALIDAD(?,?,?)}");
            cs.registerOutParameter("_id_especialidad", java.sql.Types.INTEGER);
            cs.setString("_nombre",especialidad.getNombre());
            cs.setInt("_cant_medicos",especialidad.getCant_medicos());
            /***/
            cs.executeUpdate();
            especialidad.setId_especialidad(cs.getInt("_id_especialidad"));
            resultado = 1;
        }catch(Exception ex){
          System.out.println(ex.getMessage());  
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Especialidad especialidad) {
        int resultado=0;
        try{
            con = DBManager.getInstance().getConnection();
            
            cs = con.prepareCall("{call MODIFICAR_ESPECIALIDAD(?,?,?)}");
            cs.setInt("_id_especialidad", especialidad.getId_especialidad());
            cs.setString("_nombre",especialidad.getNombre());
            cs.setInt("_cant_medicos",especialidad.getCant_medicos());
            /***/
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
    public int eliminar(int id_especialidad) {
        int resultado=0;
        try{
            con = DBManager.getInstance().getConnection();
            
            cs = con.prepareCall("{call ELIMINAR_ESPECIALIDAD(?)}");
            cs.setInt("_id_especialidad", id_especialidad);
            /***/
            cs.executeUpdate();
            resultado = 1;
        }catch(Exception ex){
          System.out.println(ex.getMessage());  
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }
    
}
