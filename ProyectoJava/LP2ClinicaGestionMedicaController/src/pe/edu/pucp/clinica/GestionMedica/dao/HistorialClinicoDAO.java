/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestioncita.model.HistorialClinico;

/**
 *
 * @author ISAI
 */
public interface HistorialClinicoDAO {
    int insertar(HistorialClinico historialClinico);
    int modificar(HistorialClinico historialClinico);
    int eliminar(HistorialClinico historialClinico);
    ArrayList <HistorialClinico> listar();
}
