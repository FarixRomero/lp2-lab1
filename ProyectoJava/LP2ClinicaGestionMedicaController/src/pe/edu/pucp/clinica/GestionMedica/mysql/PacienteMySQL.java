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
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;

/**
 *
 * @author ISAI
 */
public class PacienteMySQL implements PacienteDAO{
     //Se crea la instancia
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    /*
    @Override
    public ArrayList<Medicamento> listar() {
        ArrayList<Medicamento> medicamentos= new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_MEDICAMENTOS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
                Medicamento med = new Medicamento();
                med.setCodigo(rs.getInt("id_medicamento"));
                med.setNombre(rs.getString("nombre"));
                med.setComentario(rs.getString("codigo"));
                medicamentos.add(med);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return medicamentos;
    }
*/

    @Override
    public int insertar(Paciente paciente) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_PACIENTE(?,?,?)}");
            cs.registerOutParameter("_id_paciente", java.sql.Types.INTEGER);
            cs.setBoolean("_seguro",paciente.getSeguro());
            cs.setInt("_fid_usuario",paciente.getId_usuario());
            cs.executeUpdate();
            paciente.setIdPaciente(cs.getInt("_id_paciente"));
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
            cs = con.prepareCall("{call MODIFICAR_PACIENTE(?,?,?)}");
            cs.setInt("_id_paciente", paciente.getIdPaciente());
            cs.setBoolean("_seguro",paciente.getSeguro());
            cs.setInt("_fid_usuario",paciente.getId_usuario());
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
            cs.setInt("_id_paciente", paciente.getIdPaciente());
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
            cs = con.prepareCall("{call LISTAR_PACIENTE_TODO()}");
            rs = cs.executeQuery();
            while(rs.next()){
                Paciente p = new Paciente();
                p.setIdPaciente(rs.getInt("id_paciente"));
                p.setSeguro(rs.getBoolean("seguro"));
                p.setId_usuario(rs.getInt("fid_usuario"));
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
