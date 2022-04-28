/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.organizacion.model.Horario;

/**
 *
 * @author Equipo
 */
public interface HorarioDAO {
    ArrayList<Horario> listarTodas();
    int insertar(Horario Horario);
    int modificar(Horario Horario);
    int eliminar(int id_horario);
}
