package week1.DSAexrecise2EcommerceSearchingfunction;

public class product {
    private String productname;
    private int productid;
    private String category;
    product(String productname, int productid, String category) {
        this.productname = productname;
        this.productid = productid;
        this.category = category;
    }
    public int getProductId() {
        return productid;
    }
    public String getProductName() {
        return productname;
    }   
    public String getCategory() { 
        return category;
    }
}
