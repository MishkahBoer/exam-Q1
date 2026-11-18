public class Product implements IProduct{

    private static String[]product;
    private static int[][]sales;

    @Override
    public static int GetTotalProductSold() {
        int total=0;
        for(int i=0;i<sales.length;i++){
            for(int x=0;x<sales.length;x++){
                total+=sales[i][x];
            }
        }
        return total;
    }

    @Override
    public static double GetAverageProductSold() {
        int total=0;
        int average = 0;

        for(int i=0;i< sales.length;i++){
            for(int x=0;x< sales.length;x++){
                total+=sales[i][x];
            }
        }
        return average=average/total;
    }

    @Override
    public static String GetMostPopularProduct() {
        int highestSingeSale=0;
        String popularProduct="";

        for(int i=0;i<sales.length;i++){
            for(int x=0;x<sales.length;x++){
                if(sales[i][x]>highestSingeSale){
                    highestSingeSale=sales[i][x];
                    popularProduct=product[i]+highestSingeSale;
                }
            }
        }
        return popularProduct;
    }
}
