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
import pe.edu.pucp.clinica.GestionMedica.dao.LineaRecetaMedicaDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestionreceta.model.LineaRecetaMedica;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;

/**
 *
 * @author ISAI
 */
public class LineaRecetaMedicaMySQL implements LineaRecetaMedicaDAO{
    //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    @Override
    public int insertar(LineaRecetaMedica lineaRecetaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_LINEA_RECETA_MEDICA(?,?,?,?)}");
            cs.registerOutParameter("_id_lineaRecetaMedica", java.sql.Types.INTEGER);
            cs.setInt("_fid_recetaMedica",lineaRecetaMedica.getRecetaMedica().getIdReceta());
            cs.setInt("_fid_medicamento",lineaRecetaMedica.getMedicamento().getCodigo());
            cs.setInt("_cantidad",lineaRecetaMedica.getCantidad());
            cs.executeUpdate();
            lineaRecetaMedica.setIdLinea(cs.getInt("_id_lineaRecetaMedica"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(LineaRecetaMedica lineaRecetaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_LINEA_RECETA_MEDICA(?,?,?,?)}");
            cs.setInt("_id_lineaRecetaMedica", lineaRecetaMedica.getIdLinea());
            cs.setInt("_fid_recetaMedica",lineaRecetaMedica.getRecetaMedica().getIdReceta());
            cs.setInt("_fid_medicamento",lineaRecetaMedica.getMedicamento().getCodigo());
            cs.setInt("_cantidad",lineaRecetaMedica.getCantidad());
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
    public int eliminar(LineaRecetaMedica lineaRecetaMedica) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_LINEA_RECETA_MEDICA(?)}");
            cs.setInt("_id_lineaRecetaMedica", lineaRecetaMedica.getIdLinea());
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
    public ArrayList<LineaRecetaMedica> listar() {
        ArrayList<LineaRecetaMedica> lineaRecetaMedica= new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_LINEAS_RECETA_MEDICA()}");
            rs = cs.executeQuery();
            while(rs.next()){
                LineaRecetaMedica lrm = new LineaRecetaMedica();
                lrm.setIdLinea(rs.getInt("id_lineaRecetaMedica"));
                lrm.getRecetaMedica().setIdReceta(rs.getInt("fid_recetaMedica"));
                lrm.getMedicamento().setCodigo(rs.getInt("fid_medicamento"));
                lrm.setCantidad(rs.getInt("cantidad"));
                lineaRecetaMedica.add(lrm);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return lineaRecetaMedica;
    }
}
