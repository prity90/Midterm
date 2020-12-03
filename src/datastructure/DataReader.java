package datastructure;

import java.io.*;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String line;
		String store = "";

		try{
			fr = new FileReader("C:/Users/Prity/Q.A. Automation/MidtermSept2020-master/src/data");


		}catch(Exception e){
			System.out.println("System was not able to find attached file ");
		}

		try{
			br = new BufferedReader(fr);
			while((line =br.readLine())!= null){
				System.out.println(line);
				store+= line;

			}
		}catch(Exception e){
			System.out.println("System was not able to read attached file ");
		}

		String[] storeArray = store.split(" ");

		Stack<String> myStack = new Stack<String>();
		List<String> myList = new LinkedList<String>();
		for(String element : storeArray){
			myStack.add(element);
			myStack.push(element);
		}
		System.out.println("The LinkedList LIFO");
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " ");
		}
		System.out.println(" The Stack  LIFO");

		while(!myStack.isEmpty()){
			System.out.println(myStack.pop() + "  ");
		}
	}

}
