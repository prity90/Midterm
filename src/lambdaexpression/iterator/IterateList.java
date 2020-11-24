package lambdaexpression.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateList {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("Laptop", "Tablet", "Television", "Monitor");
        System.out.println("Classic enhanced for loop");
        for (String items : electronicsList) {
            System.out.println(items);
        }

        //Please implement Anonymous class to iterate through
        System.out.println("Using Anonymous class");


        //Please implement lambda expression to iterate through electronicsList
        System.out.println("Lambda Expression");


        //Please implement lambda Method Reference to iterate through electronicsList
        System.out.println("Lambda Method Reference-1");


        //Please implement lambda Method Reference from Electronics class to iterate through electronicsList
        System.out.println("Lambda Method Reference-2 using Electronics class");

        //Please implement stream iteration through electronicsList
        System.out.println("iterate using Stream for each loop");

    }

}
