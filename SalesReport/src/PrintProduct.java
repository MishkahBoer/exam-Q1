public class PrintProduct {
    int GetTotalProductSold;
    double GetAverageProductSold;
    String GetMostPopularProduct;
    
    public PrintProduct(int GetTotalProductSold,double GetAverageProductSold,String GetMostPopularProduct){
        this.GetTotalProductSold=GetTotalProductSold;
        this.GetAverageProductSold=GetAverageProductSold;
        this.GetMostPopularProduct=GetMostPopularProduct;
    }

    public PrintProduct(Product productData) {
    }

    public void setGetTotalProductSold(){
        IO.println("TOTAL PRODUCT SALES: "+ Product.GetTotalProductSold());
    }
    
    public void setGetAverageProductSold(){
        System.out.println("AVERAGE PRODUCT SALES" + (int)Product.GetAverageProductSold());
    }
    
    public void setGetMostPopularProduct(){
        System.out.println("MOST POPULAR PRODUCT: " + Product.GetMostPopularProduct());
    }
    
    public void PrintProduct() {
        System.out.println("PRODUCT SALES REPORT-2026");
        System.out.println("**********************************");
        setGetTotalProductSold();
        setGetAverageProductSold();
        setGetMostPopularProduct();
    }
}
