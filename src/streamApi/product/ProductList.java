package streamApi.product;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public static void main(String[] args) {
        List<product> productList= new ArrayList<>();
        productList.add(new product(1,"HP Laptop",70000.0));
        productList.add(new product(2, "Dell Laptop", 80000.0));
        productList.add(new product(3, "Asus Laptop", 50000.0));
        productList.add(new product(4, "Lenovo Laptop", 40000.0));
        productList.add(new product(5, "Samsung Laptop", 30000.0));

        System.out.println("products having price greater than 50000");
        productList.stream()
                .filter(product -> product.getPrice()>50000).forEach(product -> System.out.println(product.getName()));

        System.out.println("Total sum of all product: ");
        Double totalSum= productList.stream().map(product -> product.getPrice()).reduce(0.0, (a, b) -> a + b);
        System.out.println(totalSum);


    }
}
