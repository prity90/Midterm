package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> n = new ArrayList<>();
		n.add("Prity");
		n.add("Tuhin");
		n.add("Nafi");
		System.out.println("Original Arraylist:");
		for (String s:n)
			System.out.println(s);
		n.add(0,"Mafi Vai");
		n.add(1,"Ahasan");
		System.out.println("Arraylist after add");
		for (String s:n)
			System.out.println(s);
		n.remove("Prity");
		n.remove("Nafi");
		System.out.println("Arraylist after remove");
		for (String s:n)
			System.out.println(s);
		n.remove(1);
		System.out.println("New Arraylist");
          for (String s:n)
          	System.out.println(s);
	}

}
