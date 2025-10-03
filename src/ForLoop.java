public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
       for (int x = 10; x > 0; x--) {
           System.out.println(x);
           Thread.sleep(1000);
       }
        System.out.println("LAUNCH");
    }
}
