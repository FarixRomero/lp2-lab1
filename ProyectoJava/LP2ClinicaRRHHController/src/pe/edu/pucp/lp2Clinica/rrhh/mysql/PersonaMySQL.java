

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.lp2Clinica.rrhh.dao.PersonaDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class PersonaMySQL implements PersonaDAO{
   private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    @Override
    public ArrayList<Semestre> listarTodos() {
        ArrayList<Semestre> semestres = new ArrayList<>();
        try{
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return semestres;
    }

    @Override
    public int insertar(Semestre Sem) {
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
    public int modificar(Semestre Sem) {
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
    public int eliminar(Semestre Sem) {
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
