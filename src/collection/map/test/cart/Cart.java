package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> productMap = new HashMap<>();

    public void add(Product product, int quantity) {
//        if (productMap.containsKey(product)) {
//            productMap.put(product, productMap.get(product) + quantity);
//        } else {
//            productMap.put(product, quantity);
//        }
        Integer existingQuantity = productMap.getOrDefault(product, 0);
        productMap.put(product, existingQuantity + quantity);
    }

    public void minus(Product product, int quantity) {
//        if (productMap.containsKey(product)) {
//            if (productMap.get(product) > quantity) {
//                productMap.put(product, productMap.get(product) - quantity);
//            } else {
//                productMap.remove(product);
//            }
//        }
        int existingQuantity = productMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity <= 0) {
            productMap.remove(product);
        } else {
            productMap.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " Quantity: " + entry.getValue());
        }
    }
}
