package algorithms;

import product.Product;

public class SortingProduct {

    /***
     * Using selection sort for the sorting the products based on prices.
     * Used implemented overridden compareTo method in this for checking the price is less than of another product.
     * Time complexity will be O(n^2)
     * Space complexity will be O(1)
     * @param products
     * @return
     */
    public Product[] sortProductByPrices(Product[] products) {
        for(int i = 0; i <= products.length - 2; i++) {
            int minimumProductPriceIndex = i;
            for(int j = i; j <= products.length - 1; j++) {
                if(products[j].compareTo(products[minimumProductPriceIndex]) < 0)
                    minimumProductPriceIndex = j;
            }

            Product swappingProduct = products[minimumProductPriceIndex];
            products[minimumProductPriceIndex] = products[i];
            products[i] = swappingProduct;
        }
        return products;
    }
}
