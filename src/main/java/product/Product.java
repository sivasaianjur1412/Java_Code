package product;

public class Product implements Comparable<Product>{
    private int weight;
    private int price;
    private int id;

    Product(int weight, int price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Product product) {
        if(this.price > product.getPrice()) return 1;
        else if (this.price < product.getPrice()) return -1;
        return 0;
    }
}
