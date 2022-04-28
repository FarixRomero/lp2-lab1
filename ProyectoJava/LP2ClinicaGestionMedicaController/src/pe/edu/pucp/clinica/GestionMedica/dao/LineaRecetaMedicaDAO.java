/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestionreceta.model.LineaRecetaMedica;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;

/**
 *
 * @author ISAI
 */
public interface LineaRecetaMedicaDAO {
    int insertar(LineaRecetaMedica lineaRecetaMedica);
    int modificar(LineaRecetaMedica lineaRecetaMedica);
    int eliminar(LineaRecetaMedica lineaRecetaMedica);
    ArrayList <LineaRecetaMedica> listar();
}
