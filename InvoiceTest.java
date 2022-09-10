import java.util.Scanner;
class InvoiceTest
{
     public static void main(String Var[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Part Number:");
        String pno=s.nextLine();
        System.out.println("Enter Part Description:");
        String pdes=s.nextLine();
        System.out.println("Enter Quantitiy:");
        int q = s.nextInt();
        System.out.println("Enter Price:");
        double p=s.nextDouble();
        Invoice o = new Invoice(pno, pdes, q, p);
        double total=o.getInvoiceAmount();
        System.out.println("Part Number:"+o.getPartNum());
        System.out.println("Part Description:"+o.getPartDeS());
        System.out.println("Quantitiy:"+o.getQuan());
        System.out.println("Price :"+o.getPrice());
        System.out.println("Total Price is "+total);
        
    }
}