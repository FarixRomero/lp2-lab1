package pe.edu.pucp.clinica.rrhh.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.clinica.config.DBManager;
import pe.edu.pucp.clinica.organizacion.model.Horario;
import pe.edu.pucp.clinica.organizacion.model.HorasHorario;
import pe.edu.pucp.clinica.rrhh.dao.HorasHorarioDAO;

/**
 *
 * @author Angie Centeno Cáceres 20180214
 */
public class HorasHorarioMySQL implements HorasHorarioDAO {
    
    private Connection con;
    private CallableStatement cs;
    private ResultSet rs;

    @Override
    public ArrayList<HorasHorario> listarTodas() {
        ArrayList<HorasHorario> Hhorarios = new ArrayList<>();
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_HORASHORARIO_TODOS()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                HorasHorario elem = new HorasHorario();
                elem.setId_horasHorario(rs.getInt("id_horasHorario"));
                elem.setHora_inicio(rs.getTime("hora_inicio"));
                elem.setHora_fin(rs.getTime("hora_fin"));
                Hhorarios.add(elem);
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
        return Hhorarios;
    }

    @Override
    public int insertar(HorasHorario Hhorario) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_HORASHORARIO(?,?,?)}");
            cs.registerOutParameter("_id_horasHorario", java.sql.Types.INTEGER);
            cs.setTime("_hora_inicio", Hhorario.getHora_inicio());
            cs.setTime("_hora_fin", Hhorario.getHora_fin());
            cs.executeUpdate();
            Hhorario.setId_horasHorario(cs.getInt("_id_horasHorario"));
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
    public int modificar(HorasHorario Hhorario) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_HORASHORARIO(?,?,?)}");
            cs.setInt("_id_horasHorario", Hhorario.getId_horasHorario());
            cs.setTime("_hora_inicio",Hhorario.getHora_inicio());
            cs.setTime("_hora_fin",Hhorario.getHora_fin());
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
    public int eliminar(int id_HorasHorario) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_HORASHORARIO(?)}");
            cs.setInt("_id_horasHorario", id_HorasHorario);
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
