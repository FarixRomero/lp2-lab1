/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.rrhh.dao;


import java.util.ArrayList;

import pe.edu.pucp.clinica.organizacion.model.HorasHorario;

/**
 *
 * @author Equipo
 */
public interface HorasHorarioDAO {
    ArrayList<HorasHorario> listarTodas();
    int insertar(HorasHorario Hhorario);
    int modificar(HorasHorario Hhorario);
    int eliminar(int id_HorasHorario);
}
