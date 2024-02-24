import java.util.Stack;

/**
 * Clase Ej04. Escribe un programa que tome un String que contenga paréntesis, es decir con '(' y ')', 
 * y verifique si los paréntesis están balanceados. En otras palabras; si cada paréntesis que se abre 
 * tiene su correspondiente paréntesis que se cierra en el orden correcto. Debes utilizar una pila de 
 * tipo Character y devolver true o false. A modo de ejemplo, la siguiente cadena sí está 
 * balanceada: "((()))". Pero esta no lo está:"(()()".
 */
public class Ej04 {

	public static void main(String[] args) {

        Stack<Character> uwu = new Stack<>();
        String cad = "(()";
        boolean balance = true;

        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == '(') {
                uwu.push(c);
            } else if (c == ')') {
                if (uwu.isEmpty() || uwu.pop() != '(') {
                    balance = false;
                    break; // Salir del bucle si no está balanceado
                }
            }
        }

        if (!uwu.isEmpty()) { // Si la pila no está vacía, hay más paréntesis abiertos que cerrados
            balance = false;
        }

        if (balance)
            System.out.println("Están balanceados.");
        else
            System.out.println("No están balanceados.");
    }
    
}
