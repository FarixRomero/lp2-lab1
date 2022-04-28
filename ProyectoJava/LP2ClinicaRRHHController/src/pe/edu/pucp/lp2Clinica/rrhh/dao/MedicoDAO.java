

package pe.edu.pucp.lp2Clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Especialidad;
import pe.edu.pucp.clinica.personal.model.Medico;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface  MedicoDAO {
    ArrayList<Medico> listarTodos();
    int insertar(Medico Med);
    int modificar(Medico Med);
    int eliminar(Medico Med);
}
