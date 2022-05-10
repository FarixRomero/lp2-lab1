/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Especialidad;

/**
 *
 * @author ISAI
 */
public interface EspecialidadDAO {
    ArrayList<Especialidad> listarTodas();
    int insertar(Especialidad especialidad);
    int modificar(Especialidad especialidad);
    int eliminar(int id_especialidad);
}
