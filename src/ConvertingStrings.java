public class ConvertingStrings {
    public static void main(String[] args) {
        // 1. Convert "42" to an int. Add 8. Print result.
        String nr = "42";
        int num = Integer.parseInt(nr);
        num += 8;
        System.out.println(num);
        //2. Convert "3.14" to a double. Multiply by 2. Print.
        String nrDouble = "3.14";
        double pi = Double.parseDouble(nrDouble);
        double total = pi * 2;
        System.out.println(total);
        //Convert an int 7 to a String. Print "Number: 7".
        int num2 = 7;
        String str = Integer.toString(num2);
        System.out.println("Number: " + str);

        }
    }

