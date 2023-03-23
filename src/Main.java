import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        // for-each loop - traversing technique to iterate through the elements in an array/collection
        // less steps - more readable | less flexible

        // : is equal to in

        // for each loop for a string:
        // String[] animals = {"cat", "dog", "rat", "bird"};
// for-each loop consequently displays all elements of our array

    // for-each loop for a collection:

        ArrayList<String> animals = new ArrayList<String>();


        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
         System.out.println(i); }

        // displays all elements of our collection
    }


}
