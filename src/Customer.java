public class Customer {
    private String name;
    private int houseNumber;
    private int meterNumber;

    public Customer(String name, int houseNumber, int meterNumber) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.meterNumber = meterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(int meterNumber) {
        this.meterNumber = meterNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", meterNumber=" + meterNumber +
                '}';
    }
}
