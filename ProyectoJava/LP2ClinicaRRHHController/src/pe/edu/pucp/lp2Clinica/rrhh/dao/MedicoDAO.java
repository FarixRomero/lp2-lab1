

package pe.edu.pucp.lp2Clinica.rrhh.dao;

import pe.edu.pucp.clinica.personal.model.Medico;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface  MedicoDAO {
    
    int insertar(Medico Med);
    int modificar(Medico Med);
    int eliminar(Medico Med);
    
}
