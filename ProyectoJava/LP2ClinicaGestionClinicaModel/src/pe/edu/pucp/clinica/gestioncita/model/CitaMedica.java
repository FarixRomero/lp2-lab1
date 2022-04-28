/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.clinica.gestioncita.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ISAI
 */
public class CitaMedica {
    private int codigo;
    private EstadoCita estado;
    private Date fecha;
    private boolean ha_pagado;
	
    private Horario horario;
    private Paciente paciente;
    private Consultorio consultorio;
	
    //Constructor
    public CitaMedica(){}
    public CitaMedica (String codigo, String estado, Horario horario, Paciente paciente, Consultorio consultorio, boolean ha_pagado) {
	this.codigo = codigo;
	this.estado = estado;
        this.horario = horario;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.ha_pagado = ha_pagado;
    }
	
    //Setters
    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }
    public void setEstado(String estado) {
    	this.estado = estado;
    }
    public void setFecha (Date fecha) {
	this.fecha = fecha;
    }
    public void setHorario (Horario horario) {
	this.horario = horario;
    }
    public void setPaciente (Paciente paciente) {
	this.paciente = paciente;
    }
    public void setConsultorio (Consultorio consultorio){
        this.consultorio = consultorio;
    }
    public void setPago (boolean ha_pagado) {
        this.ha_pagado = ha_pagado;
    }
	
    //Getters
    public String getCodigo() {
	return codigo;
    }
    public String getEstado() {
	return estado;
    }
    public Date getFecha() {
	return fecha;
    }
    public Horario getHorario () {
	return horario;
    }
    public Paciente getPaciente () {
	return paciente;
    }
    public Consultorio getConsultorio () {
        return consultorio;
    }
    public boolean getPago () {
        return ha_pagado;
    }
	
    //Metodos
    public String obtenerDatosCita() {
        return "";
//      return "La cita de codigo: " + getCodigo() + " es del paciente: " + paciente.getNombre() + " con el medico: " + medico.getNombre();
    }	
}
