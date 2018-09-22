
package co.com.quipux.colegioquipux.models.entity;

import co.com.quipux.colegioquipux.dao.sql;

/**
 *
 * @author JHONATAN CARDONA
 */
public class control_matricula {
    private sql sen;
    private String id_estudiantes;

    public String getid_estudiantes() {
        return id_estudiantes;
    }

    public void setid_estudiantes(String id_estudiantes) {
        this.id_estudiantes = id_estudiantes;
    }
    
    public control_matricula()
    {
    
        sen = new sql();
}
    
    public String ingresa_nombre_estudiante()
     { 
       String result;
       result = sen.datos_string("nombre", "select nombre from estudiante where id_estudiantes='"+this.id_estudiantes+"';");
       return result;
    }
    public String ingresa_apellido_estudiante()
     { 
       String result;
       result = sen.datos_string("apellido", "select apellido from estudiante where id_estudiantes='"+this.id_estudiantes+"';");
       return result;
    }
    
    public Object[][] ingresa_codmateria(String nombre_materia)
     { 
       String[] columnas = {"id_materia"};
       Object[][] result = sen.datosTabla(columnas,"materia", "select * from materia where nombre_materia='"+nombre_materia+"';");
       return result;
    }
    
    public String ingresa_carnet_estudiante()
     { 
       String result;
       result = sen.datos_string("id_estudiantes", "select id_estudiantes from estudiante where id_estudiantes='"+this.id_estudiantes+"';");
       return result;
    }
    
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
    
    public boolean existe_estudiante( String cod)
     {
         
        this.id_estudiantes = cod;
        return sen.existe(cod, " from estudiante where id_estudiantes='"+cod+"';");
      
    }
    
    public Boolean registrar_matxest(int cod_materia)
     {
        String[] datos = {id_estudiantes, Integer.toString(cod_materia)};
        return sen.insertar(datos, "insert into materiaxestudiante(cod_IDestudiante,cod_materia ) values(?,?);");
    }
    
    public Object[][] datos_matricula (String id_estudiante)
     {
        String[] columnas={"cod_IDestudiante","nombre_materia"};
        Object[][] resultado = sen.datosTabla(columnas, "materiaxestudiante", "select * from materiaxestudiante, materia where  id_materia=cod_materia and cod_IDestudiante='"+id_estudiante+"';");
        return resultado;
      }
}
     

