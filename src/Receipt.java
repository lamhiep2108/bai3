public class Receipt {
    private int id;
    private Customer customer;
    private int oldElectricNumber;
    private int newElectricNumber;
    private int payableAmount;


    public Receipt(int id, Customer customer, int oldElectricNumber, int newElectricNumber, int payableAmount) {
        this.id = id;
        this.customer = customer;
        this.oldElectricNumber = oldElectricNumber;
        this.newElectricNumber = newElectricNumber;
        this.payableAmount = payableAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldElectricNumber() {
        return oldElectricNumber;
    }

    public void setOldElectricNumber(int oldElectricNumber) {
        this.oldElectricNumber = oldElectricNumber;
    }


    public int getNewElectricNumber() {
        return newElectricNumber;
    }

    public void setNewElectricNumber(int newElectricNumber) {
        this.newElectricNumber = newElectricNumber;
    }

    public int getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(int payableAmount) {
        this.payableAmount = payableAmount;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", customer=" + customer +
                ", oldElectricNumber=" + oldElectricNumber +
                ", getNewElectricNumber=" + newElectricNumber +
                ", payableAmount=" + payableAmount +
                '}';
    }
}
