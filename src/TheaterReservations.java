import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getReservation();
    }

    public static void getReservation() {
        //Name
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        name = reformatName(name);
        // date + parse
        System.out.println("What day will you be coming? (MM/dd/yyyy)");
        String strDate = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(strDate, dtf);
        //number of tickets
        System.out.println("How many tickets would you like");
        int nrOfTickets = scanner.nextInt();
        scanner.nextLine();
        String printTicket = nrOfTickets > 1 ? "tickets" : "ticket";
        // results
        System.out.printf("%d %s reserved for %s under %s", nrOfTickets, printTicket, date, name);
    }

    public static String reformatName(String name) {
        String[] nameParts = name.split(" ");
        return nameParts[1] + ", " + nameParts[0];
    }
}
