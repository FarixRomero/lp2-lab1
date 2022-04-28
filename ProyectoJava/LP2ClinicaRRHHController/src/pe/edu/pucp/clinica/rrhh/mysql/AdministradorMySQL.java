

package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.personal.model.Administrador;
import pe.edu.pucp.clinica.rrhh.dao.AdministradorDAO;

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
         con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call LISTAR_ADMINISTRADOR_TODOS()}");
         rs = cs.executeQuery();
         while(rs.next()){
                Administrador admin = new Administrador();
                
                admin.setId_administrador(rs.getInt("_id_administrador"));
                admin.setId_usuario(rs.getInt("_fid_usuario"));
                admin.getEspecialidad().setId_especialidad(rs.getInt("_fid_especialidad"));//OJO PIOJO
                administradores.add(admin);
        }
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
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_ADMINISTRADOR(?,?,?)}");
            /*
                    `id_administrador` int NOT NULL AUTO_INCREMENT,
                    `fid_usuario` int DEFAULT NULL,
                    `fid_especialidad` int DEFAULT NULL, 
                 */
            cs.registerOutParameter("_id_administrador", java.sql.Types.INTEGER);
            cs.setInt("_fid_usuario",Admin.getId_usuario() );
            cs.setInt("_fid_especialidad",Admin.getEspecialidad().getId_especialidad());
            /***/
            cs.executeUpdate();
            Admin.setId_administrador(cs.getInt("_id_administrador"));
            resultado = 1;
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
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_ADMINISTRADOR(?,?)}");
            /** */
            cs.setInt("_id_administrador", Admin.getId_administrador()); 
            cs.setInt("_fid_especialidad",Admin.getEspecialidad().getId_especialidad());
            //** */
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
    public int eliminar(int id_administrador) {
    int resultado=0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call ELIMINAR_ADMINISTRADOR(?)}");
        cs.setInt("_id_administrador", id_administrador);
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
