import java.util.Stack;

/**
 * Clase Ej05. Escribe un programa que tome una cadena de caracteres y verifique si es un palíndromo 
 * (es decir, si se lee igual de izquierda a derecha que de derecha a izquierda), utilizando una 
 * pila. Por ejemplo, la palabra 'radar' sí es palíndroma, pero la palabra 'hola' no lo es.
 */
public class Ej05 {

	public static void main(String[] args) {
        String palabra = "radar";
        Stack<Character> pila = new Stack<>();
        boolean palindromo = true;
        
        // Meter cada caracter de la palabra en la pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }
        
        // Comparar cada caracter de la palabra con el caracter extraído de la pila
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != pila.pop()) {
                palindromo = false;
            }
        }
        
        if (palindromo)
            System.out.println("Es un palindromo.");
        else
            System.out.println("No es un palindromo.");
    }

}
