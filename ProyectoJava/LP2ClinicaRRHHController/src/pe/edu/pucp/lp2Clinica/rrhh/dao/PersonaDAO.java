/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lp2Clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Persona;

/**
 *
 * @author Equipo
 */
public interface PersonaDAO {
    ArrayList<Persona> listarTodas();
    int insertar(Persona Per);
    int modificar(Persona Per);
    int eliminar(int id_persona);
}
