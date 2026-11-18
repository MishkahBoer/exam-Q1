//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ProductSalesApp{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    String[] Product={"Cozy Nights Monarch","Res tonic Barbados","Sealy Phuket"};

    int [][]sales=new int[Product.length][3];

    for(int i=0;i<Product.length;i++){
        for(int x=0;x<Product.length;x++){
            int month=0;
            System.out.println("Enter number of sales for month " +(month+1)+"for"+Product[1]+"mattress ");
            sales[i][x]=scanner.nextInt();
        }
        System.out.println();
    }

    Product productData = new Product(product,sales);
    PrintProduct printer=new PrintProduct(productData);
    printer.PrintProduct();
}
}
