

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.lp2Clinica.rrhh.dao.SemestreDAO;

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
//    @Override
//    public ArrayList<Semestre> listarTodos() {
//        ArrayList<Semestre> semestres = new ArrayList<>();
//        try{
//         con = DBManager.getInstance().getConnection();
//         cs = con.prepareCall("{call LISTAR_MEDICO_TODOS()}");
//         rs = cs.executeQuery();
//         while(rs.next()){
//                Semestre elem = new Semestre();
//                elem.setId_medico(rs.getInt(""));
//                elem.setApellido(rs.getString(""));
//            //admin.setEspecialidad(especialidad);
//                semestres.add(elem);
//        }
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }finally{
//            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
//        }
//        return semestres;
//    }

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
    public int eliminar(int id_semestre) {
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
