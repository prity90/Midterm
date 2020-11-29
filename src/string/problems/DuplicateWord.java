package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        int i=1;
        int count=0;
        int total=0;
        Map<Integer, String> map = new HashMap<Integer, String>();


        for (String str: st.split("\\s+")){
            map.put(i++, str);
        }
        for (int j=0; j<map.size(); j++){
            if(map.get(j).equals(map.get(j+1))){
                count++;
                System.out.println("Duplicates: "+ map.get(j) + "Number of occurence :" +count);
            }
        }
        for (int k=0; k<map.size();k++){
            total+=map.get(k).length();
        }
        int average = total / map.size();

    }

}
