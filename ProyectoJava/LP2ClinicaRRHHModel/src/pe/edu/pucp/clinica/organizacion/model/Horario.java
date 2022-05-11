package pe.edu.pucp.clinica.organizacion.model;
import java.sql.Time;
import pe.edu.pucp.clinica.personal.model.Medico;

public class Horario {
    
    private int id_horario;
    private HorasHorario horasHorario;
    private Semestre semestre;
    private Medico medico;
    private String dia;
    
    public Horario() {};

    public Horario(HorasHorario horasHorario, Semestre semestre, String dia) {
        this.horasHorario = horasHorario;
        this.semestre = semestre;
        this.dia = dia;
    }
    

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public HorasHorario getHorasHorario() {
        return horasHorario;
    }

    public void setHorasHorario(HorasHorario horasHorario) {
        this.horasHorario = horasHorario;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
    
}
