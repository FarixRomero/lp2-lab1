/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.clinica.GestionMedica.dao;

import java.util.ArrayList;
import pe.edu.pucp.clinica.herramientas.model.Comentario;


/**
 *
 * @author farix.romero
 */
public interface ComentarioDAO {
    int insertar(Comentario comentario);
    int modificar(Comentario comentario);
    int eliminar(int iDcomentario);
    ArrayList<Comentario> listar();
}
