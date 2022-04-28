

package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Consultorio;
import pe.edu.pucp.clinica.rrhh.dao.ConsultorioDAO;
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
         cs = con.prepareCall("{call LISTAR_CONSULTORIO_TODOS()}");
         rs = cs.executeQuery();
         while(rs.next()){
                Consultorio elem = new Consultorio();
                elem.setId_consultorio(rs.getInt("_id_consultorio"));
                elem.setDisponible(rs.getBoolean("_disponible"));
                consultorios.add(elem);
        }
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
          cs = con.prepareCall("{call INSERTAR_CONSULTORIO(?,?)}");
        ///********************** */
            cs.registerOutParameter("_id_consultorio", java.sql.Types.INTEGER);
            cs.setBoolean("_disponible",Consult.isDisponible());
        /** */
          cs.executeUpdate();
          Consult.setId_consultorio(cs.getInt("_id_consultorio"));
          resultado = 1;
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
            cs = con.prepareCall("{call MODIFICAR_CONSULTORIO(?,?)}");
            //*******
            cs.setInt("_id_consultorio",Consult.getId_consultorio());
            cs.setBoolean("_disponible",Consult.isDisponible()); 
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
    public int eliminar(int id_consultorio) {
       int resultado=0;
    try{
          con = DBManager.getInstance().getConnection();
          cs = con.prepareCall("{call ELIMINAR_CONSULTORIO(?)}");
          cs.setInt("_id_consultorio", id_consultorio);
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
