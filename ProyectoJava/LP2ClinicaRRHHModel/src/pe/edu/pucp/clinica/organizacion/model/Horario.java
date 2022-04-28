package pe.edu.pucp.clinica.organizacion.model;
import java.sql.Time;
public class Horario {
    public static int i=1;
    private int id_horario;
    private String dia;
    private Time hora_inicio;
    private Time hora_fin;

    public Horario(String dia, Time hora_inicio, Time hora_fin) {
        this.id_horario = i;
        this.dia = dia;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        i++;
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
