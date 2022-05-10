package pe.edu.pucp.clinica.GestionMedica.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.GestionMedica.dao.ComentarioDAO;
import pe.edu.pucp.clinica.herramientas.model.Comentario;
import pe.edu.pucp.clinica.personal.model.Medico;

public class ComentarioMySQL implements ComentarioDAO {
    
    private Connection con;
    private CallableStatement cs;
    private ResultSet rs;

    @Override
    public int insertar(Comentario comentario) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_COMENTARIO(?,?,?,?)}");
            cs.registerOutParameter("_id_comentario", java.sql.Types.INTEGER);
            cs.setString("_descripcion", (comentario.getDescripcion()));
            cs.setDate("_fecha_comentario",new java.sql.Date(comentario.getFecha_comentario().getTime()));
            cs.setInt("_fid_medico", comentario.getMedico().getId_medico());
            cs.executeUpdate();
            comentario.setId_comentario(cs.getInt("_id_comentario"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Comentario comentario) {
         int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_COMENTARIO(?,?,?,?)}");
            cs.setInt("_id_comentario", (comentario.getId_comentario()));
            cs.setString("_descripcion", (comentario.getDescripcion()));
            cs.setDate("_fecha_comentario",new java.sql.Date(comentario.getFecha_comentario().getTime()));
            cs.setInt("_fid_medico", (comentario.getMedico().getId_medico()));
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
    public int eliminar(int id_comentario){
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_COMENTARIO(?)}");
            cs.setInt("_id_comentario", id_comentario);
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
    public ArrayList<Comentario> listar() {
        ArrayList<Comentario> comentarios= new ArrayList<>();
         try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_COMENTARIOS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Comentario comentario = new Comentario();
               
               comentario.setId_comentario(rs.getInt("id_comentario"));
               comentario.setDescripcion(rs.getString("descripcion"));
               comentario.setFecha_comentario(rs.getDate("fecha_comentario"));
               comentario.setMedico(new Medico());
               comentario.getMedico().setId_medico(rs.getInt("id_medico"));
               comentarios.add(comentario);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return comentarios;
    }
}
