import java.util.ArrayList;

public class ProductTech implements Product{
    String name;
    double price;
    String model;
    ArrayList<Integer> rating;

    public ProductTech(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }
    public void changeName(String name){
        this.name = name;
        System.out.println("Название изменено на "+this.name);
    }
    public void changePrice(double price){
        this.price = price;
    }
    public void changeTotalRate(int... newRate){
        for(int i: newRate){
            this.rating.add(i);
        }
    }
}
