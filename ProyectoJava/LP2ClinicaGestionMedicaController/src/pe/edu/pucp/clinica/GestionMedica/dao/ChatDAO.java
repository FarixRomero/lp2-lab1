package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.herramientas.model.Chat;

public interface ChatDAO {
    int insertar(Chat chat);
    int modificar(Chat chat);
    int eliminar(int id_chat);
    ArrayList<Chat> listar();
}
