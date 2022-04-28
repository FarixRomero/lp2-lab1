

package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.clinica.rrhh.dao.SemestreDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class SemestreMySQL implements SemestreDAO{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
   @Override
   public ArrayList<Semestre> listarTodos() {
       ArrayList<Semestre> semestres = new ArrayList<>();
       try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call LISTAR_SEMESTRES_TODOS()}");
        rs = cs.executeQuery();
        while(rs.next()){
               Semestre elem = new Semestre();
               
               elem.setId_semestre(rs.getInt("_id_semestre"));
               elem.setNombre(rs.getString("_nombre")); 
            // falta los dates
               semestres.add(elem);
       }
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
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_SEMESTRE(?,?,?,?)}");
         /*
               id_semestre int AI PK 
                nombre varchar(50) 
                fecha_inicio date 
                fecha_fin date
                 */
         //*******

        cs.registerOutParameter("_id_semestre", java.sql.Types.INTEGER);
        cs.setString("_nombre",Sem.getNombre()); 
        cs.setDate("_fecha_inicio",new java.sql.Date(Sem.getFecha_inicio().getTime()));
        cs.setDate("_fecha_fin",new java.sql.Date(Sem.getFecha_fin().getTime()));
        //*******
        cs.executeUpdate();
        Sem.setId_semestre(cs.getInt("_id_semestre"));
        resultado = 1;    
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
          con = DBManager.getInstance().getConnection();
       cs = con.prepareCall("{call MODIFICAR_SEMESTRE(?,?,?,?)}");
        //*******
        cs.setInt("_id_semestre",Sem.getId_semestre());
        cs.setString("_nombre",Sem.getNombre()); 
        cs.setDate("_fecha_inicio",new java.sql.Date(Sem.getFecha_inicio().getTime()));
        cs.setDate("_fecha_fin",new java.sql.Date(Sem.getFecha_fin().getTime()));
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
    public int eliminar(int id_semestre) {
        int resultado=0;
    try{
         con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call ELIMINAR_SEMESTRE(?)}");
        cs.setInt("_id_semestre", id_semestre);
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
