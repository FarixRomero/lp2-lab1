

package pe.edu.pucp.clinica.rrhh.dao;
import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Administrador;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface AdministradorDAO {
    ArrayList<Administrador> listarTodas();
    int insertar(Administrador Admin);
    int modificar(Administrador Admin);
    int eliminar(int id_administrador);
    
}
