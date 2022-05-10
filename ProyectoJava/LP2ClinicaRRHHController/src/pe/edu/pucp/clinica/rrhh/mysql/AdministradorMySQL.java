

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
                admin.setId_administrador(rs.getInt("id_administrador"));
                admin.setId_usuario(rs.getInt("fid_usuario"));
                admin.getEspecialidad().setId_especialidad(rs.getInt("fid_especialidad"));
                administradores.add(admin);
        }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("HOLA");
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
            
            cs = con.prepareCall("{call INSERTAR_PERSONA(?,?,?,?)}");
            cs.registerOutParameter("_id_persona", java.sql.Types.INTEGER);
            cs.setString("_DNI", Admin.getDNI());
            cs.setString("_nombre", Admin.getNombre());
            cs.setString("_apellido", Admin.getApellido());
            //*******
            cs.executeUpdate();
            Admin.setId_persona(cs.getInt("_id_persona"));

            cs = con.prepareCall("{call INSERTAR_USUARIO(?,?,?,?,?,?)}");
            //*******
            cs.registerOutParameter("_id_usuario", java.sql.Types.INTEGER);
            cs.setInt("_fid_persona",Admin.getId_persona());
            cs.setString("_email",Admin.getEmail());
            cs.setString("_username",Admin.getUsername());
            cs.setString("_password",Admin.getPassword());
            cs.setInt("_estado",Admin.getEstado());
            //*******
            cs.executeUpdate();
            Admin.setId_usuario(cs.getInt("_id_usuario"));
            
            cs = con.prepareCall("{call INSERTAR_ADMINISTRADOR(?,?,?)}");
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
