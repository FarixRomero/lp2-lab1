/* 
 * Curso:   Lenguaje de Programación 2
 * Alumno:  Pedro Fernando Yataco Delgado
 * 
 * Código:  20190876
 * Horario: H-0781
 */

package pe.edu.pucp.clinica.GestionMedica.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.GestionMedica.dao.ChatDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;
import pe.edu.pucp.clinica.herramientas.model.Chat;
import pe.edu.pucp.clinica.personal.model.Medico;

public class ChatMySQL implements ChatDAO {
    
    private Connection con;
    private CallableStatement cs;
    private ResultSet rs;

    @Override
    public int insertar(Chat chat) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_CHAT(?,?,?,?,?,?,?)}");
            cs.registerOutParameter("_id_chat", java.sql.Types.INTEGER);
            cs.setString("_comentario", chat.getComentario());
            cs.setDate("_fecha", new java.sql.Date(chat.getFecha().getTime()));
            cs.setString("_emisor", chat.getEmisor());
            cs.setTime("_hora", chat.getHora());
            cs.setInt("_fid_medico", chat.getMedico().getId_medico());
            cs.setInt("_fid_paciente", chat.getPaciente().getId_paciente());
            cs.executeUpdate();
            chat.setId_chat(cs.getInt("_id_chat"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Chat chat) {
         int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_CHAT(?,?,?,?,?,?,?)}");
            cs.setInt("_id_chat", (chat.getId_chat()));
            cs.setString("_comentario", chat.getComentario());
            cs.setDate("_fecha", new java.sql.Date(chat.getFecha().getTime()));
            cs.setString("_emisor", chat.getEmisor());
            cs.setTime("_hora", chat.getHora());
            cs.setInt("_fid_medico", chat.getMedico().getId_medico());
            cs.setInt("_fid_paciente", chat.getPaciente().getId_paciente());
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
    public int eliminar(int id_chat){
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_CHAT(?)}");
            cs.setInt("_id_chat", id_chat);
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
    public ArrayList<Chat> listar() {
        ArrayList<Chat> chats = new ArrayList<>();
         try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_CHATS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Chat chat = new Chat();
               
               chat.setId_chat(rs.getInt("id_chat"));
               chat.setComentario(rs.getString("comentario"));
               chat.setFecha(rs.getDate("fecha"));
               chat.setEmisor(rs.getString("emisor"));
               chat.setHora(rs.getTime("hora"));
               
               chat.setMedico(new Medico());
               chat.getMedico().setId_medico(rs.getInt("fid_medico"));
               
               chat.setPaciente(new Paciente());
               chat.getPaciente().setId_paciente(rs.getInt("fid_paciente"));
               
               chats.add(chat);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return chats;
    }

}
