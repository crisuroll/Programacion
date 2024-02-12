import java.util.LinkedList;
import java.util.Queue;

/**
 * Encontrar el elemento máximo en una cola.
 */
public class FindMax {

	public static void main(String[] args) {
		Queue<Integer> uwu = new LinkedList<Integer>();
		uwu.add(100);
		uwu.add(23);
		uwu.add(42);
		
		int numQ = 0;
		int max = Integer.MIN_VALUE;
		while(!uwu.isEmpty()) {
			numQ = uwu.element();
			uwu.poll();
			max = Math.max(max, numQ);
		}
		System.out.println(max);
	}

}
