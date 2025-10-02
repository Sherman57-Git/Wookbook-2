import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Suffix: ");
        String Suffix = scanner.nextLine().trim();

      String FullName = (firstName
              +middleName
              + lastName
              + Suffix );
        System.out.println(FullName);



    }
}
