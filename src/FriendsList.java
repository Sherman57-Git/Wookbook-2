import java.util.ArrayList;
import java.util.List;

public class FriendsList {
    public static void main(String[] args) {
        List<String> Friends = new ArrayList<>();
        Friends.add("Sherk");
        Friends.add("Donkey");
        Friends.add("PussNBoots");
        Friends.add("SherkWife");
        Friends.add("Dragon");
        Friends.remove("PussNBoots");

        for(int i = 0; i < Friends.size(); i++) {
            System.out.println(Friends.get(i));
        }
    }
}
