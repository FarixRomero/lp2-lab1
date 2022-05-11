/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.GestionMedica.dao.PacienteDAO;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;

/**
 *
 * @author ISAI
 */
public class PacienteMySQL implements PacienteDAO{
     //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    

    @Override
    public int insertar(Paciente paciente) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            
            cs = con.prepareCall("{call INSERTAR_PERSONA(?,?,?,?)}");
            cs.registerOutParameter("_id_persona", java.sql.Types.INTEGER);
            cs.setString("_DNI", paciente.getDNI());
            cs.setString("_nombre", paciente.getNombre());
            cs.setString("_apellido", paciente.getApellido());
            cs.executeUpdate();
            paciente.setId_persona(cs.getInt("_id_persona"));
            
            cs = con.prepareCall("{call INSERTAR_USUARIO(?,?,?,?,?,?)}");
            cs.registerOutParameter("_id_usuario", java.sql.Types.INTEGER);
            cs.setInt("_fid_persona",paciente.getId_persona());
            cs.setString("_email",paciente.getEmail());
            cs.setString("_username",paciente.getUsername());
            cs.setString("_password",paciente.getPassword());
            cs.setInt("_estado",paciente.getEstado());
            cs.executeUpdate();
            paciente.setId_usuario(cs.getInt("_id_usuario"));
            
            
            cs = con.prepareCall("{call INSERTAR_PACIENTE(?,?,?)}");
            cs.registerOutParameter("_id_paciente", java.sql.Types.INTEGER);
            cs.setBoolean("_seguro",paciente.getSeguro());
            cs.setInt("_fid_usuario",paciente.getId_usuario());
            cs.executeUpdate();
            paciente.setId_paciente(cs.getInt("_id_paciente"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Paciente paciente) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_PACIENTE(?,?)}");
            cs.setInt("_id_paciente", paciente.getId_paciente());
            cs.setBoolean("_seguro",paciente.getSeguro());
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
    public int eliminar(Paciente paciente) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            
            cs = con.prepareCall("{call ELIMINAR_PACIENTE(?)}");
            cs.setInt("_id_paciente", paciente.getId_paciente());
            cs.executeUpdate();
            
            cs = con.prepareCall("{call ELIMINAR_USUARIO(?)}");
            cs.setInt("_id_usuario", paciente.getId_usuario());
            cs.executeUpdate();
            
            cs = con.prepareCall("{call ELIMINAR_PERSONA(?)}");
            cs.setInt("_id_persona", paciente.getId_persona());
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
    public ArrayList<Paciente> listar() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_PACIENTE_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                Paciente p = new Paciente();
                p.setId_paciente(rs.getInt("id_paciente"));
                p.setSeguro(rs.getBoolean("seguro"));
                
                p.setId_usuario(rs.getInt("id_usuario"));
                p.setEmail(rs.getString("email"));
                p.setUsername(rs.getString("username"));
                p.setPassword(rs.getString("password"));
                
                p.setId_persona(rs.getInt("id_usuario"));
                p.setDNI(rs.getString("DNI"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                
                pacientes.add(p);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return pacientes;
    }
    
}
