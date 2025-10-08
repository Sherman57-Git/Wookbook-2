import java.util.ArrayList;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(9, 8 ,6,7,0,2,4,3,5,1));
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
        for (int i = 1; i <= 10; i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        for (int nr : numbers) {
            System.out.println(nr);
        }
    }
}