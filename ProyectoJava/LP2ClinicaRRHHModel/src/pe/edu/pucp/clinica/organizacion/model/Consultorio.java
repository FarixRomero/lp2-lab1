package pe.edu.pucp.clinica.organizacion.model;
import java.util.ArrayList;

public class Consultorio {
    private int id_consultorio;
    private String nombre;
    private boolean disponible;

    public Consultorio() {}
    
    public Consultorio(String nombre) {
        this.nombre = nombre;
        this.disponible = true;
    }

    public int getId_consultorio() {
        return id_consultorio;
    }

    public void setId_consultorio(int id_consultorio) {
        this.id_consultorio = id_consultorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
