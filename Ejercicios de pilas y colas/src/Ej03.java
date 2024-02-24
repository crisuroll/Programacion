import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Clase Ej03. Escribe un programa en Java que dado una cola, pregunte al usuario por un número k 
 * (asegúrate que k es mayor que 0 y menor que el tamaño de la cola, y si no es así, vuelve a pedir 
 * otro número). Después, invierte los primeros k elementos de dicha cola. Imprime la cola al 
 * principio y al final para comparar el resultado.
 */
public class Ej03 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> uwu = new PriorityQueue<>();

        // Llenar la cola con algunos elementos de ejemplo
        uwu.add(1);
        uwu.add(2);
        uwu.add(3);
        uwu.add(4);
        uwu.add(5);

        System.out.println("Cola original: " + uwu);

        int k;
        do {
            System.out.print("Ingrese un número k (mayor que 0 y menor que el tamaño de la cola): ");
            k = sc.nextInt();
        } while (k <= 0 || k > uwu.size());
  
        if (k <= 1 || k > uwu.size())
            return;

        // Sacar los primeros k elementos de la cola y guardarlos en una pila
        Queue<Integer> tempQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            tempQueue.add(uwu.poll());
        }

        // Vaciar la pila en orden inverso a la cola original
        while (!tempQueue.isEmpty()) {
            uwu.add(tempQueue.poll());
        }

        // Mantener el resto de los elementos de la cola en su orden original
        for (int i = 0; i < uwu.size() - k; i++) {
        	uwu.add(uwu.poll());
        }

        System.out.println("Cola invertida: " + uwu);
    }

}
