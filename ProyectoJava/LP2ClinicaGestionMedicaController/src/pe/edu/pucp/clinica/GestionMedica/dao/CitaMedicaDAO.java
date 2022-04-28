package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestioncita.model.CitaMedica;

public interface CitaMedicaDAO {
    int insertar(CitaMedica citaMedica);
    int modificar(CitaMedica citaMedica);
    int eliminar(CitaMedica citaMedica);
    ArrayList<CitaMedica> listar();
}
