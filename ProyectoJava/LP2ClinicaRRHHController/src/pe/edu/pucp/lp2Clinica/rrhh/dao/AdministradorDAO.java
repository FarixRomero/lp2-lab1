

package pe.edu.pucp.lp2Clinica.rrhh.dao;
import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Administrador;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public interface AdministradorDAO {
    // la dependedencia fue el problema de todo :(
    ArrayList<Administrador> listarTodas();
    int insertar(Administrador Admin);
    int modificar(Administrador Admin);
    int eliminar(Administrador Admin);
    
}
