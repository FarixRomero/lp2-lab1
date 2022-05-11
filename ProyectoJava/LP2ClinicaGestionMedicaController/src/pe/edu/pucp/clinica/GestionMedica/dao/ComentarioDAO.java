package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.herramientas.model.Comentario;

public interface ComentarioDAO {
    int insertar(Comentario comentario);
    int modificar(Comentario comentario);
    int eliminar(int id_comentario);
    ArrayList<Comentario> listar();
}
