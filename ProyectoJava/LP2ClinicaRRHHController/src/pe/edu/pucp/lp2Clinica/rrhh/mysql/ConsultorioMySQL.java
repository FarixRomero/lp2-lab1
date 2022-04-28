

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Consultorio;
import pe.edu.pucp.lp2Clinica.rrhh.dao.ConsultorioDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class ConsultorioMySQL implements ConsultorioDAO{
     private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    @Override
    public ArrayList<Consultorio> listarTodas() {
         ArrayList<Consultorio> consultorios = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return consultorios;
    }

    @Override
    public int insertar(Consultorio Consult) {
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
    public int modificar(Consultorio Consult) {
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
    public int eliminar(Consultorio Consult) {
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
