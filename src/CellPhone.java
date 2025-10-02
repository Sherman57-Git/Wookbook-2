public class CellPhone {
    private Long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
      serialNumber = 0L;
      model = " ";
      carrier = " ";
      phoneNumber = " ";
      owner = " ";

    }
    public CellPhone(Long serialNumber, String model, String carrier, String phoneNumber,
                     String owner) {
        this.serialNumber = serialNumber;
    }
}
