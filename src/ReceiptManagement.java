import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptManagement {
    List<Receipt> receipts = new ArrayList<>();
    public void add(Receipt r) {
        receipts.add(r);
    }

    public void update(Receipt receipt) {
        for (Receipt r : receipts) {
            if (receipt.getId() == r.getId()) {
               r.setCustomer(receipt.getCustomer());
               r.setOldElectricNumber(receipt.getOldElectricNumber());
               r.setNewElectricNumber(receipt.getNewElectricNumber());
               }
            }
        }
        public void delete(int id){
            receipts.removeIf(r -> r.getId() == id);
        }
        public Receipt search(int id){
        Receipt receipt=null;
            for (Receipt r:receipts) {
                if (r.getId()==id){
                    receipt = r;
                }
            } return receipt;
        }

        public void showAll(){
            for (Receipt r:receipts) {
                System.out.println(r.toString());
            }

        }
    }
