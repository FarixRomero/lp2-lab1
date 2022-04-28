/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.lp2Clinica.GestionMedica.dao;

import java.util.ArrayList;

/**
 *
 * @author farix.romero
 */
public interface ChatDAO {
    int insertar(Comentario comentario);
    int modificar(Comentario comentario);
    int eliminar(int idcomentario);
    ArrayList<Comentario> listarTodos();
}
