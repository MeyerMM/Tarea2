package Tarea2.Model;

import java.util.List;

public interface ProductList {
    List<Product> getProductList();
    void addProduct(Product product);
    Product getProduct(String code);
    Product removeProduct(String code);
}
