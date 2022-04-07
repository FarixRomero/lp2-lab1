//https://docs.oracle.com/javase/7/docs/api/java/sql/Time.html checar TIME
import java.sql.Time;
class Horario {
	
	// Estado o características
	private int id_horario;
	private Time hora_inicio;
	private Time hora_fin;
	private Medico medico;
	// private Semestre semestre;
	
    // Constructores
    public Horario(){}
    public Horario(Time hora_inicio,Time hora_fin ){
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }
	
    // Getters
    public Time getHoraInicio(){
        return this.hora_inicio;
    }
    public Time getHoraFinal(){
        return this.hora_fin;
    }

}