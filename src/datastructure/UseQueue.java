package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();
		queue.poll();

		Queue<String> st = new LinkedList<String>();
		st.add("Alpha");
		st.add("beta");
		st.add("gamma");
		st.add("don cortez");

		st.remove(3);
		System.out.println("available variables are: " + st);

		System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st.peek());
		System.out.println(st.poll());

		for (
				String item : st)
			System.out.print(item + ", ");

		System.out.print("\nThe Queue items using iterator: ");
		Iterator<String> iter = st.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");


		}
	}

}
