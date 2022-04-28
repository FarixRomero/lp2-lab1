

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.personal.model.Medico;
import pe.edu.pucp.lp2Clinica.rrhh.dao.MedicoDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class MedicoMySQL implements MedicoDAO{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    @Override
    public ArrayList<Medico> listarTodos() {
        ArrayList<Medico> medicos = new ArrayList<>();
        try{
         con = DBManager.getInstance().getConnection();   
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return medicos;
    }

    @Override
    public int insertar(Medico Med) {
    int resultado=0;
    try{
        con = DBManager.getInstance().getConnection();   
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;     
    }

    @Override
    public int modificar(Medico Med) {
    int resultado=0;
    try{
          con = DBManager.getInstance().getConnection();  
        }catch(Exception ex){
           System.out.println(ex.getMessage()); 
        }finally{
           try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado; 
    }

    @Override
    public int eliminar(Medico Med) {
       int resultado=0;
    try{
         con = DBManager.getInstance().getConnection();   
        }catch(Exception ex){
           System.out.println(ex.getMessage()); 
        }finally{
           try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado; 
    }

}
