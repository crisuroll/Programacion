import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Eliminar el elemento n en una cola.
 */
public class DeleteElem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> uwu = new LinkedList<Integer>();
		uwu.add(2);
		uwu.add(5);
		uwu.add(3);

		int numQ = uwu.element();
		System.out.println("¿Que elemento quieres eliminar?: ");
		int num = sc.nextInt();
		
		while (numQ == uwu.size()) {
			if(numQ == num) {
				uwu.poll();
			} else {
				numQ = uwu.element();
				uwu.poll();
				uwu.add(numQ);
			}
		}

		System.out.println(uwu);

	}

}
