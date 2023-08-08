public class ManipularCadenaII {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String alumno1, alumno2;

        alumno1="Israel";
        alumno2="Israel";
        boolean hola = alumno1.equalsIgnoreCase(alumno2);
       
        if (hola) {
            
            System.out.println("Son iguales");
        }else{
            System.out.println("Distintos");
        }

    
    }
}
