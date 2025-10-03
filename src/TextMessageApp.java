public class TextMessageApp {
    public static void main(String[] args) {
        TextMessage chat1 = new TextMessage();
        chat1.setSenderNumber("+31611111111");
        chat1.setReciverNumber("+31622222222");
        chat1.setBody("On my way!");
        chat1.setSent(LocalDate.now());
        chat1.display();
    }
}
