/**
 * Herramientas para este ejercicio
 */
public class Herramientas {



    
    /** 
     * Comprueba si el parámetro de entrada contiene
     * únicamente un número entero o no
     * 
     * @param texto el texto que se va a comprobar
     * @return Boolean 
     */
    public static Boolean comprobarSiEsInt(String texto){
        try{
            Integer.parseInt(texto);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
