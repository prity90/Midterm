package datastructure;

import com.google.gson.internal.LinkedHashTreeMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Map<String,String> map= new HashMap<>();
		map.put ("USA", "California");
		map.put ("CANADA", "Toronto");

		System.out.println(map.get("USA"));
		System.out.println(map.get("CANADA"));
	}

}
