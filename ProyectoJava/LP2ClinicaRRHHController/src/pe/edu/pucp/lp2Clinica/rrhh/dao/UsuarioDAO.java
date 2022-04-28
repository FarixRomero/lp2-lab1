

package pe.edu.pucp.lp2Clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Usuario;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface  UsuarioDAO {
    ArrayList<Usuario> listarTodas();
    int insertar( Usuario User);
    int modificar( Usuario User );
    int eliminar( Usuario User);
}
