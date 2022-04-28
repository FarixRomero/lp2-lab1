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
import pe.edu.pucp.clinica.GestionMedica.dao.RecetaMedicaDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;
import pe.edu.pucp.clinica.gestionreceta.model.RecetaMedica;

/**
 *
 * @author ISAI
 */
public class RecetaMedicaMySQL implements RecetaMedicaDAO{
    
    //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(RecetaMedica recetaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_RECETA_MEDICA(?,?,?)}");
            cs.registerOutParameter("_id_receta_medica", java.sql.Types.INTEGER);
            cs.setInt("_fid_diagnostico",(recetaMedica.getDiagnostico().getCodigo()));
            cs.setString("_cod_receta", (recetaMedica.getCodReceta()));
            cs.executeUpdate();
            recetaMedica.setIdReceta(cs.getInt("_id_receta_medica"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(RecetaMedica recetaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_RECETA_MEDICA(?,?,?)}");
            cs.setInt("_id_receta_medica", recetaMedica.getIdReceta());
            cs.setInt("_fid_diagnostico",(recetaMedica.getDiagnostico().getCodigo()));
            cs.setString("_cod_receta", (recetaMedica.getCodReceta()));
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
    public int eliminar(RecetaMedica recetaMedica) {
         int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_RECETA_MEDICA(?,?,?)}");
            cs.setInt("_id_receta_medica", recetaMedica.getIdReceta());
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;  
    }
    
    @Override
    public ArrayList<RecetaMedica> listar() {
       ArrayList<RecetaMedica> recetaMedica= new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_RECETA_MEDICA_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                RecetaMedica rMed = new RecetaMedica();
                rMed.setIdReceta(rs.getInt("id_recetaMedica"));
                rMed.getDiagnostico().setCodigo(rs.getInt("fid_diagnostico"));
                rMed.setCodReceta(rs.getString("cod_receta"));
                recetaMedica.add(rMed);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return recetaMedica;
    }
    
}
