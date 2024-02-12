import java.util.LinkedList;
import java.util.Queue;

/**
 * Hacer un sumatorio de los elementos de una cola.
 */
public class SumElem {

	public static void main(String[] args) {
		Queue<Integer> uwu = new LinkedList<Integer>();
		uwu.add(2);
		uwu.add(5);
		uwu.add(3);

		int numQ = 0;
		int sum = 0;
		while(!uwu.isEmpty()) {
			numQ = uwu.element();
			uwu.poll();
			sum = sum + numQ;
		}
		System.out.println(sum);
	}

}
