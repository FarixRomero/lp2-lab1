

package pe.edu.pucp.lp2Clinica.rrhh.mysql;

import java.util.ArrayList;
import pe.edu.pucp.clinica.organizacion.model.Horario;
import pe.edu.pucp.lp2Clinica.rrhh.dao.HorarioDAO;

/**
 *
 * @author Angie Centeno Cáceres
    20180214
 */
public class HorarioMySQL implements HorarioDAO{
   @Override
    public ArrayList<Horario> listarTodas() {
        ArrayList<Horario> horarios = new ArrayList<>();
        try{
            
        }catch(Exception ex){
            
        }finally{
            try{
            }catch(Exception ex){
            
            }
        }
        return horarios;
    }

    @Override
    public int insertar(Horario Horario) {
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
    public int modificar(Horario Horario) {
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
    public int eliminar(Horario Horario) {
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
