
package pe.edu.pucp.lp2Clinica.GestionMedica.dao;


//import pe.edu.pucp.lp2soft.rrhh.model.Empleado;

import java.util.ArrayList;



public interface ComentarioDAO {
    int insertar(Comentario comentario);
    int modificar(Comentario comentario);
    int eliminar(int idcomentario);
    ArrayList<Comentario> listarTodos();
}