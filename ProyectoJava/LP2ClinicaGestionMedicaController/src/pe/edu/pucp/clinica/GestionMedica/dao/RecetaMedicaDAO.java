/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;
import pe.edu.pucp.clinica.gestionreceta.model.RecetaMedica;

/**
 *
 * @author ISAI
 */
public interface RecetaMedicaDAO {
    int insertar(RecetaMedica recetaMedica);
    int modificar(RecetaMedica recetaMedica);
    int eliminar(RecetaMedica recetaMedica);
    ArrayList <RecetaMedica> listar();
}
