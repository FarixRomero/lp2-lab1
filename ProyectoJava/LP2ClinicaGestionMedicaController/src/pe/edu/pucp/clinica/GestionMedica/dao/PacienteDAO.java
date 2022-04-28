/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestioncita.model.Paciente;

/**
 *
 * @author ISAI
 */
public interface PacienteDAO {
    int insertar(Paciente paciente);
    int modificar(Paciente paciente);
    int eliminar(Paciente paciente);
    ArrayList <Paciente> listar();
}
