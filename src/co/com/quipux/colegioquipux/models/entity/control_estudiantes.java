
package co.com.quipux.colegioquipux.models.entity;

import co.com.quipux.colegioquipux.dao.sql;

/**
 *
 * @author JHONATAN CARDONA
 */
public class control_estudiantes {
    
    sql sensql;
   
    public control_estudiantes() {
        
        sensql = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_estudiante(String id_estudiantes, String documento, String Tipo_doc, String nombre, String apellido, String sexo)
    {               
        
            String datos[] = {id_estudiantes,documento,Tipo_doc,nombre,apellido,sexo};           
            return sensql.insertar(datos, "insert into estudiante(id_estudiantes, documento,Tipo_doc,nombre,apellido,sexo) values(?,?,?,?,?,?)");
                                  
        
    }
    
    
    
}
