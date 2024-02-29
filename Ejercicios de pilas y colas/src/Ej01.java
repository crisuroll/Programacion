import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Clase Ej01. Escribe un programa en Java que obtenga el mayor elemento en una cola de enteros.
 */
public class Ej01 {

	public static void main(String[] args) {
		Queue<Integer> uwu = new PriorityQueue<Integer>();
		uwu.add(100);
		uwu.add(230);
		uwu.add(42);
		
		int numQ = 0;
		int max = uwu.peek();
		while(!uwu.isEmpty()) {
			numQ = uwu.poll();
			if (numQ > max) {
				max = numQ;
			}
		}
		System.out.println(max);
	}

}
