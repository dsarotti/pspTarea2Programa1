/**
 * Programa que recibe un array de strings y 
 * devuelve un resultado en función de las entradas
 */
public class ProgramaUno {

    /**
     * 
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