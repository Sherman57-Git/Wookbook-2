package Cars;

public class Vehicle {
    private Long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle () {
        vehicleId = 0L;
        makeModel = " ";
        color = " ";
        odometerReading = Integer.parseInt(" ");

    }
    // conductor
    public Vehicle (Long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;


    }

    public void display() {
        System.out.printf("%-8d %-20s %-10s %-10d $%.2f%n",
                vehicleId, makeModel, color, odometerReading, price);
    }
}
