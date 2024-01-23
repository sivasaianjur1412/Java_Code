package product;

import algorithms.SortingProduct;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(20, 100, 1),
                new Product(35, 45, 2),
                new Product(45, 57, 3)
         };

        //performing sorting algorithm to sort prices.
        SortingProduct sortingProduct = new SortingProduct();
        products = sortingProduct.sortProductByPrices(products);



        System.out.println("Products based on prices");
        for(Product product : products){

            System.out.println("product Id: " + product.getId()
                    + " product weight: " + product.getWeight()
                    + " price: " + product.getPrice());

        }
    }
}
