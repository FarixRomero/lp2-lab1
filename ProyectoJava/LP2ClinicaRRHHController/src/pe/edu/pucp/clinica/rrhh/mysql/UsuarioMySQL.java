

package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.personal.model.Usuario;
import pe.edu.pucp.clinica.rrhh.dao.UsuarioDAO;

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
       con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call LISTAR_USUARIO_TODOS()}");
        rs = cs.executeQuery();
        while(rs.next()){
//               Usuario elem = new Usuario() ;
//               elem.setId_usuario(rs.getInt("_id_usuario"));
//               elem.setId_persona(rs.getInt("_fid_persona"));
//               elem.setEmail(rs.getString("_email"));
//               elem.setUsername(rs.getString("_username"));
//               elem.setPassword(rs.getString("_password")); 
//               elem.setEstado(rs.getInt("_estado"));
//               usuarios.add(elem);
       }    
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
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_USUARIO(?,?,?,?,?,?)}");
        //*******
        cs.registerOutParameter("_id_usuario", java.sql.Types.INTEGER);
        cs.setInt("_fid_persona",User.getId_persona());
        cs.setString("_email",User.getEmail());
        cs.setString("_username",User.getUsername());
        cs.setString("_password",User.getPassword());
        cs.setInt("_estado",User.getEstado());
        //*******
        cs.executeUpdate();
        User.setId_usuario(cs.getInt("_id_usuario"));
        resultado = 1;
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
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call MODIFICAR_USUARIO(?,?,?,?,?)}");
        //*******
        cs.setInt("_id_usuario",User.getId_usuario());
        cs.setString("_email",User.getEmail());
        cs.setString("_username",User.getUsername());
        cs.setString("_password",User.getPassword());
        cs.setInt("_estado",User.getEstado());
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
    public int eliminar(int id_usuario) {
    int resultado=0;
    try{
        con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call ELIMINAR_USUARIO(?)}");
        cs.setInt("_id_usuario", id_usuario);
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
