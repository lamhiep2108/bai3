import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Customer>customers=new ArrayList<>();
    private int newNumber;
    private int oldNumber;

    public Receipt() {
        this.customers = customers;
        this.newNumber = newNumber;
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customers=" + customers +
                ", newNumber=" + newNumber +
                ", oldNumber=" + oldNumber +
                '}';
    }
    public void add(Customer c){
        customers.add(c);
        System.out.println(c.toString());
    }

}
