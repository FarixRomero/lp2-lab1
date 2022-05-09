

package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.personal.model.Medico;
import pe.edu.pucp.clinica.rrhh.dao.MedicoDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class MedicoMySQL implements MedicoDAO{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;
    @Override
    public ArrayList<Medico> listarTodos() {
        ArrayList<Medico> medicos = new ArrayList<>();
        try{
         con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call LISTAR_MEDICO_TODOS()}");
         rs = cs.executeQuery();
         while(rs.next()){
                Medico elem = new Medico();
                elem.setId_medico(rs.getInt("_id_medico"));
                elem.setId_usuario(rs.getInt("_fid_usuario"));
                elem.getEspecialidad().setId_especialidad(rs.getInt("_fid_especialidad"));//OJO AL PIOJO
                elem.getAdministrador().setId_administrador(rs.getInt("_fid_administrador"));// OJO FALTA IMPLEMENTAR
                elem.setCalificacion(rs.getDouble("_calificacion"));
                elem.setCant_pacientes(rs.getInt("_cant_pacientes"));

                medicos.add(elem);
        }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return medicos;
    }

    @Override
    public int insertar(Medico Med) {
    int resultado=0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_PERSONA(?,?,?,?)}");
        /*
        id_persona int AI PK 
        DNI varchar(8) 
        nombre varchar(50) 
        apellido varchar(50)
        */
         //*******
            cs.registerOutParameter("_id_persona", java.sql.Types.INTEGER);
            cs.setString("_DNI", Med.getDNI());
            cs.setString("_nombre", Med.getNombre());
            cs.setString("_apellido", Med.getApellido());
        //*******
        cs.executeUpdate();
        Med.setId_persona(cs.getInt("_id_persona"));

        cs = con.prepareCall("{call INSERTAR_USUARIO(?,?,?,?,?,?)}");
        //*******
        cs.registerOutParameter("_id_usuario", java.sql.Types.INTEGER);
        cs.setInt("_fid_persona",Med.getId_persona());
        cs.setString("_email",Med.getEmail());
        cs.setString("_username",Med.getUsername());
        cs.setString("_password",Med.getPassword());
        cs.setInt("_estado",Med.getEstado());
        //*******
        cs.executeUpdate();
        Med.setId_usuario(cs.getInt("_id_usuario"));
        
        cs = con.prepareCall("{call INSERTAR_MEDICO(?,?,?,?,?,?)}");
        /**id_medico int AI PK 
        fid_usuario int 
        fid_especialidad int 
        fid_administrador int 
        calificacion decimal(10,2) 
        cant_pacientes int
        */
         //*******
        cs.registerOutParameter("_id_medico", java.sql.Types.INTEGER);
        cs.setInt("_fid_usuario",Med.getId_usuario());
        cs.setInt("_fid_especialidad",Med.getEspecialidad().getId_especialidad());
        cs.setInt("_fid_administrador",Med.getAdministrador().getId_administrador());
        cs.setDouble("_calificacion",Med.getCalificacion());
        cs.setInt("_cant_pacientes",Med.getCant_pacientes());
        //*******
        cs.executeUpdate();
        Med.setId_medico(cs.getInt("_id_medico"));
        resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;     
    }

    @Override
    public int modificar(Medico Med) {
    int resultado=0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call MODIFICAR_MEDICO(?,?,?,?)}");
         //*******
        cs.setInt("_id_medico",Med.getId_medico());
        cs.setInt("_fid_especialidad",Med.getEspecialidad().getId_especialidad());
        cs.setDouble("_calificacion",Med.getCalificacion());
        cs.setInt("_cant_pacientes",Med.getCant_pacientes());
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
    public int eliminar(int id_medico) {
       int resultado=0;
    try{
         con = DBManager.getInstance().getConnection();
         cs = con.prepareCall("{call ELIMINAR_MEDICO(?)}");
        cs.setInt("_id_medico", id_medico);
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
