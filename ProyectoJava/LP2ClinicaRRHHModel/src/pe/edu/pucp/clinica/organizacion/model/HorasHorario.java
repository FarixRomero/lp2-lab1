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
    private int idHorasHorario;
    private Time hora_ini;
    private Time hora_fini;
    public HorasHorario(){};
    public HorasHorario(int idHorasHorario, Time hora_ini, Time hora_fini) {
        this.idHorasHorario = idHorasHorario;
        this.hora_ini = hora_ini;
        this.hora_fini = hora_fini;
    }

    public int getIdHorasHorario() {
        return idHorasHorario;
    }

    public void setIdHorasHorario(int idHorasHorario) {
        this.idHorasHorario = idHorasHorario;
    }

    public Time getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(Time hora_ini) {
        this.hora_ini = hora_ini;
    }

    public Time getHora_fini() {
        return hora_fini;
    }

    public void setHora_fini(Time hora_fini) {
        this.hora_fini = hora_fini;
    }
    
    
}
