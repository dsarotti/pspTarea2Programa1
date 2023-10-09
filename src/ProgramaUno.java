/**
 * Programa que recibe un array de strings y 
 * devuelve un resultado en función de las entradas
 * @author Dante Sarotti
 * @version 0.1
 */
public class ProgramaUno {

    /**
     * admite argumentos desde main() y devuelve con System.exit() los siguientes valores:
     * Si el número de argumentos es < 1 devuelve 1
     * Siel argumento es una cadena devuelve 2
     * Si el argumento es un número entero menor que 0 devuelve 3
     * En cualquier otro caso devuelve 0
     * @param args argumentos de entrada
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if(args.length<1){
            System.exit(1);
        }else{
            for (String string : args) {
                if (!string.isEmpty()){
                    if (!Herramientas.comprobarSiEsInt(string)){
                    System.exit(2);
                }else if (Integer.parseInt(string)<0){      
                    System.exit(3);
                }
            }else {
                System.exit(1);
            }
            System.exit(0);   
            }
        }
    }
}