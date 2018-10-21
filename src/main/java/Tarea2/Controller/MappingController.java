package Tarea2.Controller;

import Tarea2.Model.ProductList;
import Tarea2.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MappingController {
    private ProductList  productList;

    public MappingController() {
        this.productList = new ProductList();
    }

    // Show product list
    @GetMapping("/ProductList")
    public String productList(Model model) {
        List<Product> products = productList.getProductList();
        model.addAttribute("products", products);
        return "productList";
    }

    // Show specific product, using its unique code
    @GetMapping("/Product/{code}")
    public String product(Model model, @PathVariable String code) {
        Product product = productList.getProduct(code);
        model.addAttribute("product", product);
        return "product";
    }

    // Remove a product, using its unique code
    @GetMapping("/RemoveProduct/{code}")
    public String removeProduct(Model model, @PathVariable String code) {
        Product product = productList.removeProduct(code);
        model.addAttribute("product", product);
        return "removedProduct";
    }

    // Show form to add a new product
    @GetMapping("/NewProduct")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "newProduct";
    }

    // Add a new product. If the product code is already in use, the old object will be replaced with the new one.
    @PostMapping("/NewProduct")
    public String productSubmit(@ModelAttribute Product product) {
        productList.addProduct(product);
        return "newProduct";
    }
}