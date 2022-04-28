/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
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
    private CallableStatement cs;
    
    @Override
    public int insertar(Medicamento medicamento) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_CITA_MEDICA(?,?,?,?,?)}");
            cs.registerOutParameter("_id_medicamento", java.sql.Types.INTEGER);
            cs.setString("_codigo", (medicamento.getComentario()));
            cs.setString("_nombre", (medicamento.getNombre()));
            cs.executeUpdate();
            medicamento.setCodigo(cs.getInt("_id_medicamento"));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Medicamento medicamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Medicamento> listar() {
        ArrayList<Medicamento> medicamentos= new ArrayList<>();
        return medicamentos;
    }



    
}
