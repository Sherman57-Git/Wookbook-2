public class SwitchExercise {
    public static void main(String[] args) {
        int days = 1;
        switch (days) {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("tuesday");
                ;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Invalid day");
                break;


        }

        // Grades
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Perfect");

            case 'B':
                System.out.println("Good Job");

            case 'C':
                System.out.println("Pass, but could do better");
                break;
        }
        // Numbers
        int favNumber = 2;
        switch(favNumber) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            default:
                System.out.println("other");
                break;
        }

    }
}


