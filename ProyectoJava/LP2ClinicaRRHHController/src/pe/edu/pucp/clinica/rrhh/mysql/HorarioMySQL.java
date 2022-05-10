package pe.edu.pucp.clinica.rrhh.mysql;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Horario;
import pe.edu.pucp.clinica.organizacion.model.HorasHorario;
import pe.edu.pucp.clinica.organizacion.model.Semestre;
import pe.edu.pucp.clinica.personal.model.Medico;
import pe.edu.pucp.clinica.rrhh.dao.HorarioDAO;

/**
 *
 * @author Angie Centeno Cáceres 20180214
 */
public class HorarioMySQL implements HorarioDAO {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private CallableStatement cs;

    @Override
    public ArrayList<Horario> listarTodas() {
        ArrayList<Horario> horarios = new ArrayList<>();
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_HORARIO_TODOS()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                Horario elem = new Horario();
                elem.setId_horario(rs.getInt("id_horario"));
                elem.setMedico(new Medico());
                elem.getMedico().setId_medico(rs.getInt("fid_medico"));
                elem.setSemestre(new Semestre());
                elem.getSemestre().setId_semestre(rs.getInt("fid_semestre"));
                elem.setHorasHorario(new HorasHorario());
                elem.getHorasHorario().setId_horasHorario(rs.getInt("fid_horasHorario"));
                elem.setDia(rs.getString("dia"));
                
                horarios.add(elem);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return horarios;
    }

    @Override
    public int insertar(Horario Horario) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_HORARIO(?,?,?,?,?)}");
            /**
             * *****
             * id_horario int AI PK fid_horasHorario int fid_semestre int
             * fid_medico int dia varchar(50)
             */

            cs.registerOutParameter("_id_horario", java.sql.Types.INTEGER);
            cs.setInt("_fid_horasHorario", Horario.getHorasHorario().getId_horasHorario());
            cs.setInt("_fid_semestre", Horario.getSemestre().getId_semestre());
            cs.setInt("_fid_medico", Horario.getMedico().getId_medico());
            cs.setString("_dia", Horario.getDia());
            //**** */
            cs.executeUpdate();
            Horario.setId_horario(cs.getInt("_id_horario"));
            resultado = 1;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public int modificar(Horario Horario) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_HORARIO(?,?,?)}");
            //*******
            cs.setInt("_id_horario", Horario.getId_horario());
            cs.setInt("_fid_horasHorario", Horario.getHorasHorario().getId_horasHorario());
            cs.setString("_dia", Horario.getDia());
            //*******
            cs.executeUpdate();
            resultado = 1;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public int eliminar(int id_horario) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_HORARIO(?)}");
            cs.setInt("_id_horario", id_horario);
            cs.executeUpdate();
            resultado = 1;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
}
