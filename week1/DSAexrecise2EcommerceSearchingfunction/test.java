package week1.DSAexrecise2EcommerceSearchingfunction;

import java.util.*;
public class test {
    //Set<product> products = new HashSet<>();
    List<product> productList = new ArrayList<>();

    public void addProductToList(String productname, int productid, String category) {
        product p = new product(productname, productid, category);
        productList.add(p);
    }
    public void searchProductByNameLinearSearch(String productname) {
        for (product p : productList) {
            if (p.getProductName().equalsIgnoreCase(productname)) {
                System.out.println("Product found: " + p.getProductName() + " with ID: " + p.getProductId()+ " in category: " + p.getCategory());
                return;
            }
        }
        System.out.println("Product not found");
    }
    public void searchProductByIdBinarySearch(int productid) {
        productList.sort(Comparator.comparingInt(product::getProductId));
        int left = 0;
        int right = productList.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (productList.get(mid).getProductId() == productid) {
                System.out.println("Product found: " + productList.get(mid).getProductName() + " with ID: " + productList.get(mid).getProductId()+ " in category: " + productList.get(mid).getCategory());
                return;
            } else if (productList.get(mid).getProductId() < productid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Product not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test t = new test();
        t.addProductToList("Laptop", 101, "Electronics");
        t.addProductToList("Smartphone", 102, "Electronics");
        t.addProductToList("Shoes", 103, "Fashion");
        t.addProductToList("Watch", 104, "Accessories");

        System.out.println("Enter product name to search:");
        String productName = sc.nextLine();
        System.out.println("Searching for product by name using linear search:");
        t.searchProductByNameLinearSearch(productName);
        System.out.println("Enter product ID to search:");
        int productId = sc.nextInt();
        System.out.println("Searching for product by ID using binary search:");
        t.searchProductByIdBinarySearch(productId);
        sc.close();
    }
}
