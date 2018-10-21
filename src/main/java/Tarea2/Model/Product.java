package Tarea2.Model;

public class Product {
    private String code;
    private String name;
    private String description;
    private float price;

    public Product() {
    }

    public Product(String code, String name, String description, float price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}