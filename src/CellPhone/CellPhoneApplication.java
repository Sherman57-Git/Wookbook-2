package CellPhone;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp = new CellPhone();
        System.out.println("What is the serial number?");
        cp.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.println("What model is the phone?");
        cp.setModel(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Who is the carrier?");
        cp.setOwner(scanner.nextLine());
        scanner.nextLine();
        System.out.println("What is the phone number?");
        cp.setPhoneNumber(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Who is the owner of the phone?");
        cp.setOwner(scanner.nextLine());
        scanner.nextLine();

        System.out.printf("The %s with serial number %d by carrier %s and phone nr %s is owned by %s.", cp.getModel(), cp.getSerialNumber(), cp.getCarrier(), cp.getPhoneNumber(), cp.getOwner());






    }
}