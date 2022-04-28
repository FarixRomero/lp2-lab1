

package pe.edu.pucp.lp2Clinica.rrhh.dao;
import pe.edu.pucp.clinica.personal.model.Administrador;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface AdministradorDAO {
    
    int insertar(Administrador Admin);
    int modificar(Administrador Admin);
    int eliminar(Administrador Admin);
    
}
