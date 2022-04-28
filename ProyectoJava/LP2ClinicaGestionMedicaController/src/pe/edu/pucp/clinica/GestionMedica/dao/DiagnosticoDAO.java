/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestioncita.model.Diagnostico;

/**
 *
 * @author ISAI
 */
public interface DiagnosticoDAO {
    int insertar(Diagnostico diagnostico);
    int modificar(Diagnostico diagnostico);
    int eliminar(Diagnostico diagnostico);
    ArrayList <Diagnostico> listar();
}
