/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.organizacion.model.Semestre;

/**
 *
 * @author Equipo
 */
public interface SemestreDAO {
     ArrayList<Semestre> listarTodos();
    int insertar(Semestre Sem);
    int modificar(Semestre Sem);
    int eliminar(int id_semestre);
}
