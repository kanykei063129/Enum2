import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("TV","Это лучший телевизор",30000, LocalDate.of(2010,6,4),Service.ELECTRONIOS);
        Product product1 = new Product("JACKET","это теплая куртка",1500,LocalDate.of(2022,7,1),Service.CLOTHES);
        Product product2 = new Product("PEPPER","По дешевой цене",100,LocalDate.of(2023,2,10),Service.VEGETABLE);
        Inventory inventory = new Inventory(new  Product[] {product,product1,product2});
        System.out.println(inventory.getAllName("PEPPER"));
    }
}