package pe.edu.pucp.clinica.personal.model;
import java.util.Date;
public abstract class Usuario extends Persona {
    private int id_usuario;
    private String email;
    private String username;
    private String password;
    private int estado;

    // CONSTRUCTORES
    public Usuario() {}
    public Usuario(String DNI, String nombre, String apellido, 
            Date fecha_nacimiento,String email, String username,
            String password, int estado) {
        super(DNI,nombre,apellido,fecha_nacimiento);
        this.email = email;
        this.username = username;
        this.password = password;
        this.estado = estado;           
    }
    
    // GETTERS Y SETTERS

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    // COMPORTAMIENTOS O METODOS
    public String consultarDatosUsuario(){
        // Devuelve la data de el usuario
        return " ";
    }
    
    public abstract void Login();
    public abstract void RecuperarPassword();
    public abstract void ModificarDatos();
    public abstract void GestionarCitas();

}
