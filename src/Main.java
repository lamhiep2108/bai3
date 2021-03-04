import java.util.Scanner;

public class Main {
    static ReceiptManagement rm =new ReceiptManagement();

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        do {
        System.out.println("--------------");
        System.out.println("1.add");
        System.out.println("2.update");
        System.out.println("3.delete");
        System.out.println("4.search");
        System.out.println("5.showAll");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice){
            case 1:
                Receipt receipt = Menus.getReceiptCustomer();
                rm.add(receipt);
                break;
            case 2:
                Receipt receipt1=Menus.getReceiptCustomer();
                rm.update(receipt1);
                break;
            case 3:
                System.out.println("enter id");
                int id = Integer.parseInt(input.nextLine());
                rm.delete(id);
                break;
            case 4:
                System.out.println("enter id");
                int id1 =Integer.parseInt(input.nextLine());
                System.out.println(rm.search(id1));
                break;
            case 5:
                rm.showAll();
                break;
            case 0:
                continue;
        }
    }while (true);
}
}
