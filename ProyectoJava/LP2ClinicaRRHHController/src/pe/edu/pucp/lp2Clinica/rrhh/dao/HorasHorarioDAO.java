/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lp2Clinica.rrhh.dao;


import pe.edu.pucp.clinica.organizacion.model.Horario;

/**
 *
 * @author Equipo
 */
public interface HorasHorarioDAO {
    
    int insertar(Horario Horario);
    int modificar(Horario Horario);
    int eliminar(int id_HorasHorario);
}
