
import java.util.Scanner;

public class Menus {
    static Scanner scanner=new Scanner(System.in);

    public static Receipt getReceiptCustomer(){
        System.out.println("-----------------");
        System.out.println("enter id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter House number");
        int houseNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("enter meter number");
        int meterNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter odl electric number ");
        int oldElectricNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter new electric number");
        int newElectricNumber = Integer.parseInt(scanner.nextLine());
        int payableAmount = (newElectricNumber-oldElectricNumber)*750;
        Customer customer=new Customer(name,houseNumber,meterNumber);
        Receipt receipt=new Receipt(id,customer,oldElectricNumber,newElectricNumber,payableAmount);
        return receipt;
    }
  }
