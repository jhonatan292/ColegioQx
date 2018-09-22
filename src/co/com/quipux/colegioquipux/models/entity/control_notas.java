
package co.com.quipux.colegioquipux.models.entity;

import co.com.quipux.colegioquipux.dao.sql;

/**
 *
 * @author JHONATAN CARDONA
 */
public class control_notas {
    
      private sql sen;
    
    public control_notas()
    {
      sen = new sql();  
    }
    
    
    
    public Object[][] consulta_materia_notas(String id)
       {
        String[] columnas={"cod_IDestudiante","cod_materia", "nombre_materia"};
        Object[][] resultado = sen.datosTabla(columnas, "materiaxestudiante", "select * from materiaxestudiante, materia where cod_materia=id_materia  and cod_IDestudiante='"+id+"';");
        return resultado;
       }
    
    public boolean ingresar_notas(String cod_carnetnota, String cod_materianota, Double nota)
    {               
           
            String datos[] = {cod_carnetnota, cod_materianota, Double.toString(nota)};           
            return sen.insertar(datos, "insert into nota(cod_IDestudiantenota, cod_materianota, nota) values(?,?,?)");
                                  
        
    }
    
}
