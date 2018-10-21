package Tarea2.Model;


import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private HashMap<String, Product> productMap;
    // The product list will be stored in this HashMap. The product code is the key. The product object is the value.

    public ProductList() {
        this.productMap = new HashMap<String, Product>();
        Product productA = new Product("1","CocaCola", "Refresco sabor cola.", 1);
        Product productB = new Product("2","Minalba", "Agua mineral embotellada.", 1);
        productMap.put(productA.getCode(), productA);
        productMap.put(productB.getCode(), productB);
    }

    // Iteration of the hash map to generate and return a list of all the products.
    public  List<Product> getProductList(){
        List<Product> products = new ArrayList<Product>();
        Set set = productMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            products.add((Product)entry.getValue());
        }
        return products;
    }

    public void addProduct(Product product){
        productMap.put(product.getCode(), product);
        // If the product code is already in use, the old object will be replaced with the new one.
    }

    public Product getProduct(String code){
        Product product = productMap.get(code);
        if (product == null) {
            return new Product("Product not found","Product not found","Product not found",-1);
        } else {
            return product;
        }
    }

    public Product removeProduct(String code){
        Product product = productMap.remove(code);
        if (product == null) {
            return new Product("Product not found","Product not found","Product not found",-1);
        } else {
            return product;
        }
    }
}
