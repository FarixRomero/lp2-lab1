/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.gestionreceta.model.Medicamento;

/**
 *
 * @author ISAI
 */
public interface MedicamentoDAO {
    ArrayList <Medicamento> listar();
    int insertar(Medicamento medicamento);
    int modificar(Medicamento medicamento);
    int eliminar(Medicamento medicamento);
}
