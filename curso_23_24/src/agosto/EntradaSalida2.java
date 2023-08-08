import javax.swing.JOptionPane;
import javax.swing.text.html.Option;

public class EntradaSalida2 {
    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("Escribe el nombre");
        String edadS=JOptionPane.showInputDialog("Escribe la edad");
        // modificar la edad que esta es String a Int
        int edad=Integer.parseInt(edadS);
        
        System.out.println(nombre + " y " + edad);
    
    }
}
