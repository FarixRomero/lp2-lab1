package pe.edu.pucp.clinica.organizacion.model;
import java.util.ArrayList;

public class Consultorio {
    public static int i=1;
    private int id_consultorio;
    private boolean disponible;

    public Consultorio() {}
    
    public Consultorio(boolean disponible) {
        this.id_consultorio = i;
        i++;
        this.disponible = disponible;
    }

    public int getId_consultorio() {
        return id_consultorio;
    }

    public void setId_consultorio(int id_consultorio) {
        this.id_consultorio = id_consultorio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}