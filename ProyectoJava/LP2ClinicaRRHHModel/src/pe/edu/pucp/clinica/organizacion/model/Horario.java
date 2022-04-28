package pe.edu.pucp.clinica.organizacion.model;
import java.sql.Time;
import pe.edu.pucp.clinica.personal.model.Medico;

public class Horario {
    private int id_horario;
    private String dia;
    private HorasHorario id_horasHorario;
    private Semestre id_semestre;
    private Medico id_medico;

    public Horario(String dia) {
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

    public HorasHorario getId_horasHorario() {
        return id_horasHorario;
    }

    public void setId_horasHorario(HorasHorario id_horasHorario) {
        this.id_horasHorario = id_horasHorario;
    }

    public Semestre getId_semestre() {
        return id_semestre;
    }

    public void setId_semestre(Semestre id_semestre) {
        this.id_semestre = id_semestre;
    }

    public Medico getId_medico() {
        return id_medico;
    }

    public void setId_medico(Medico id_medico) {
        this.id_medico = id_medico;
    }

    
    
}
