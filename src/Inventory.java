import java.util.Arrays;

public class Inventory {
    Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
    public Product getAllName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
    public Product getAllType(Service service) {
        return null;
    }
}
