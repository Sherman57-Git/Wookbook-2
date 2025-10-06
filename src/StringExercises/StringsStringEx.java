package StringExercises;

public class StringsStringEx {
    public static void main(String[] args) {
        // Hello Length from a string
        String nr1 = "Hello";
        System.out.println("length of " + nr1 + ": " + nr1.length());
        // Make Java uppercased in string
        String nr2 = "Java";
        System.out.println(nr2.toUpperCase());
        //Make "World" print fisrt character
        String nr3 = "World";
        System.out.println("First character of " + nr3 + ": " + nr3.charAt(0));
        // Getting the index of r in world
        int index = nr3.indexOf('r');
        System.out.println("Index of 'r' in " + nr3 + ": " + index );
    }
}
