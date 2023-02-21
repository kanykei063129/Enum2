import java.time.LocalDate;

public class Product {
    private String name;
    private String desoription;
    private  int price;
    private LocalDate madeOfDate;
    private Service service;

    public Product(String name, String desoription, int price, LocalDate madeOfDate, Service service) {
        this.name = name;
        this.desoription = desoription;
        this.price = price;
        this.madeOfDate = madeOfDate;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesoription() {
        return desoription;
    }

    public void setDesoription(String desoription) {
        this.desoription = desoription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadeOfDate() {
        return madeOfDate;
    }

    public void setMadeOfDate(LocalDate madeOfDate) {
        this.madeOfDate = madeOfDate;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desoription='" + desoription + '\'' +
                ", price=" + price +
                ", madeOfDate=" + madeOfDate +
                ", service=" + service +
                '}';
    }
}


