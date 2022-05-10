/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.organizacion.model;

import java.sql.Time;

/**
 *
 * @author ISAI
 */
public class HorasHorario {
    private int id_horasHorario;
    private Time hora_inicio;
    private Time hora_fin;
    
    public HorasHorario(){}
    public HorasHorario(Time hora_inicio, Time hora_fin) {
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public int getId_horasHorario() {
        return id_horasHorario;
    }

    public void setId_horasHorario(int id_horasHorario) {
        this.id_horasHorario = id_horasHorario;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }
    
}
