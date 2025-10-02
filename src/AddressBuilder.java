public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder address = new StringBuilder();
        // append strings
        address.append("Grover Smith\n\n");
        address.append("Billing Address:\n123 Main Street\n" +
                "Middleton, TX 75111\n\n");
        address.append("Shipping Address:\n");
        address.append("456 Big Sky Blvd\n" +
                "Outer Rim, TX 75333");
        // retrieve the underlying characters from
        // the StringBuilder
        String Address = address.toString();
        System.out.println(address);


    }
}
