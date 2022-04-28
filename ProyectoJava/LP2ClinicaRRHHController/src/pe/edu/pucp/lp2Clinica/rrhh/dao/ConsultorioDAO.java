/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lp2Clinica.rrhh.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.organizacion.model.Consultorio;

/**
 *
 * @author Equipo
 */
public interface ConsultorioDAO {
    ArrayList<Consultorio> listarTodas();
    int insertar(Consultorio Consult);
    int modificar(Consultorio Consult);
    int eliminar(int id_consultorio);
}
