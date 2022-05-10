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
import pe.edu.pucp.clinica.GestionMedica.dao.MedicamentoDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;

/**
 *
 * @author ISAI
 */
public class MedicamentoMySQL implements MedicamentoDAO{
    
    //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    @Override
    public int insertar(Medicamento medicamento) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_MEDICAMENTO(?,?,?)}");
            cs.registerOutParameter("_id_medicamento", java.sql.Types.INTEGER);
            cs.setString("_codigo", (medicamento.getCodigo()));
            cs.setString("_nombre", (medicamento.getNombre()));
            cs.executeUpdate();
            medicamento.setId_medicamento(cs.getInt("_id_medicamento"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Medicamento medicamento) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_MEDICAMENTO(?,?,?)}");
            cs.setInt("_id_medicamento",medicamento.getId_medicamento());
            cs.setString("_nombre",medicamento.getNombre());
            cs.setString("_codigo", medicamento.getCodigo());
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
    public int eliminar(Medicamento medicamento) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_MEDICAMENTO(?)}");
            cs.setInt("_id_medicamento", medicamento.getId_medicamento());
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
    public ArrayList<Medicamento> listar() {
        ArrayList<Medicamento> medicamentos= new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_MEDICAMENTOS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                Medicamento med = new Medicamento();
                med.setId_medicamento(rs.getInt("id_medicamento"));
                med.setNombre(rs.getString("nombre"));
                med.setCodigo(rs.getString("codigo"));
                medicamentos.add(med);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return medicamentos;
    }
}
