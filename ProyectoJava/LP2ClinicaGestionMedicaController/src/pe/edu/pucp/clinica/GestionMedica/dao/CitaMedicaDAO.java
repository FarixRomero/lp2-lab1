package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestioncita.model.CitaMedica;

public interface CitaMedicaDAO {
    int insertar();
    int modificar();
    int eliminar();
    ArrayList<CitaMedica> listar();
}
