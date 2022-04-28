

package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.clinica.personal.model.Persona;
import pe.edu.pucp.clinica.rrhh.dao.PersonaDAO;

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
    public ArrayList<Persona> listarTodas() {
        ArrayList<Persona> medicos = new ArrayList<>();
        try{
         con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call LISTAR_PERSONAS_TODOS()}");
         rs = cs.executeQuery();
         while(rs.next()){
                Persona elem = new Persona() {};
                elem.setId_persona(rs.getInt("_id_persona"));
                elem.setDNI(rs.getString("_DNI"));
                elem.setNombre(rs.getString("_nombre"));
                elem.setApellido(rs.getString("_apellido"));
                medicos.add(elem);
        }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return medicos;
    }
    @Override
    public int insertar(Persona per) {
        int resultado=0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_PERSONA(?,?)}");
        /*
        id_persona int AI PK 
        DNI varchar(8) 
        nombre varchar(50) 
        apellido varchar(50)
        */
         //*******
            cs.registerOutParameter("_id_persona", java.sql.Types.INTEGER);
            cs.setString("_DNI", per.getDNI());
            cs.setString("_nombre", per.getNombre());
            cs.setString("_apellido", per.getApellido());
        //*******
        cs.executeUpdate();
        per.setId_persona(cs.getInt("_id_persona"));
        resultado = 1; 
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado; 
    }

    @Override
    public int modificar(Persona per) {
        int resultado=0;
    try{
         con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call MODIFICAR_PERSONA(?,?,?,?)}");
        //*******
            cs.setInt("_id_persona",per.getId_persona());
            cs.setString("_DNI", per.getDNI());
            cs.setString("_nombre", per.getNombre());
            cs.setString("_apellido", per.getApellido());
        //*******
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
    public int eliminar(int id_persona) {
        int resultado=0;
    try{
          con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call ELIMINAR_PERSONA(?)}");
        cs.setInt("id_persona", id_persona);
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
