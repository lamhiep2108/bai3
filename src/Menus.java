
import java.util.Scanner;

public class Menus {
    static Receipt receipt=new Receipt();
    static Scanner scanner=new Scanner(System.in);

    public static Customer getCustomer(){
        System.out.println("-----------------");
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter House number");
        int houseNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("enter meter number");
        int meterNumber = Integer.parseInt(scanner.nextLine());
        return new Customer(name,houseNumber,meterNumber);
    }

    public static void main(String[] args) {

        do {
            Customer customer=getCustomer();
            System.out.println("nhập số điện cũ");
            int oldNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập số điện mới");
            int newNumber= Integer.parseInt(scanner.nextLine());
            int a = (newNumber - oldNumber)*750;
            receipt.add(customer);
            System.out.println("số tiền phải trả :"+a);
        }while (true);

    }
}
