

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Administrador;
import pe.edu.pucp.lp2Clinica.rrhh.dao.AdministradorDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class AdministradorMySQL  implements AdministradorDAO{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    @Override
    public ArrayList<Administrador> listarTodas() {
        ArrayList<Administrador> administradores = new ArrayList<>();
        try{
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return administradores;
    }

    @Override
    public int insertar(Administrador Admin) {
        int resultado=0;
        try{
            
        }catch(Exception ex){
          System.out.println(ex.getMessage());  
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Administrador Admin) {
        int resultado=0;
        try{
            
        }catch(Exception ex){
           System.out.println(ex.getMessage()); 
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int eliminar(Administrador Admin) {
    int resultado=0;
    try{
            
        }catch(Exception ex){
           System.out.println(ex.getMessage()); 
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;     
    }
}
