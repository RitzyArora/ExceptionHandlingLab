import java.util.Scanner;

public class CafeStarMain {
    public static void main(String[] args){
        int quantity;
        double cgst = 2.5;
        double sgst = 2.5;
        double amount;
        Scanner scan = new Scanner(System.in);
        CafeStar cafeStar = new CafeStar();
        System.out.println("-----------------------Welcome to CafeStar------------------------");
try {
    System.out.println("Enter the Quantity of items");
    quantity = scan.nextInt();
    cafeStar.setQuantity(quantity);

    cafeStar.setCgst(cgst);
    cafeStar.setSgst(sgst);
    System.out.println("Enter the amount per item");
    amount = scan.nextDouble();
    cafeStar.setAmount(amount);

}

catch (Exception e)
{
    System.out.println(e.getMessage());
}

finally{
    System.out.println("The total bill is as follows");
    System.out.println(cafeStar.calculateAmount());
}

        }
    }

