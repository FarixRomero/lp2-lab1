

package pe.edu.pucp.lp2Clinica.rrhh.dao;

import pe.edu.pucp.clinica.personal.model.Usuario;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface  UsuarioDAO {
    int insertar( Usuario User);
    int modificar( Usuario User );
    int eliminar( Usuario User);
}
