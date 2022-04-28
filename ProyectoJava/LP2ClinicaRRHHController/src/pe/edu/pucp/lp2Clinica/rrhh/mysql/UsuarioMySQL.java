

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.util.ArrayList;
import pe.edu.pucp.clinica.personal.model.Usuario;
import pe.edu.pucp.lp2Clinica.rrhh.dao.UsuarioDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class UsuarioMySQL implements UsuarioDAO{

    @Override
    public ArrayList<Usuario> listarTodas() {
         ArrayList<Usuario> usuarios = new ArrayList<>();
        try{
            
        }catch(Exception ex){
            
        }finally{
            try{
            }catch(Exception ex){
            
            }
        }
        return usuarios;
    }

    @Override
    public int insertar(Usuario User) {
        int resultado=0;
    try{
            
        }catch(Exception ex){
            
        }finally{
            try{
            }catch(Exception ex){
            
            }
        }
        return resultado; 
    }

    @Override
    public int modificar(Usuario User) {
    int resultado=0;
    try{
            
        }catch(Exception ex){
            
        }finally{
            try{
            }catch(Exception ex){
            
            }
        }
        return resultado;     
    }

    @Override
    public int eliminar(Usuario User) {
    int resultado=0;
    try{
            
        }catch(Exception ex){
            
        }finally{
            try{
            }catch(Exception ex){
            
            }
        }
        return resultado;   
    }

}
