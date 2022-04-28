

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Horario;
import pe.edu.pucp.lp2Clinica.rrhh.dao.HorarioDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class HorarioMySQL implements HorarioDAO{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
//    @Override
//    public ArrayList<Horario> listarTodas() {
//        ArrayList<Horario> horarios = new ArrayList<>();
//        try{
//          con = DBManager.getInstance().getConnection();
//         cs = con.prepareCall("{call LISTAR_HORARIO_TODOS()}");
//         rs = cs.executeQuery();
//         while(rs.next()){
//                Horario elem = new Horario();
//                elem.setId_horario(rs.getInt(""));
//                elem.setId_medico(rs.getInt(""));
//                elem.setId_semestre(rs.getInt(""));
//                elem.setId_horasHorario(rs.getInt(""));
//            //admin.setEspecialidad(especialidad);
//                horarios.add(elem);
//        }  
//        }catch(Exception ex){
//          System.out.println(ex.getMessage());  
//        }finally{
//           try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
//        }
//        return horarios;
//    }

    @Override
    public int insertar(Horario Horario) {
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
    public int modificar(Horario Horario) {
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
    public int eliminar(int id_horario) {
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
