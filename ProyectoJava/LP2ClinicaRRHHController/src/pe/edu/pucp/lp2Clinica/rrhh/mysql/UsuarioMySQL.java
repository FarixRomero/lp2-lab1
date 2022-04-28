

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Usuario;
import pe.edu.pucp.lp2Clinica.rrhh.dao.UsuarioDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class UsuarioMySQL implements UsuarioDAO{
private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    @Override
    public ArrayList<Usuario> listarTodas() {
         ArrayList<Usuario> usuarios = new ArrayList<>();
        try{
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return usuarios;
    }

    @Override
    public int insertar(Usuario User) {
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
    public int modificar(Usuario User) {
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
    public int eliminar(Usuario User) {
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
