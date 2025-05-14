import java.util.ArrayList;

public class ProductClothes implements Product{
    String name;
    double price;
    int size;
    ArrayList<Integer> rating;

    public ProductClothes(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
    public void changeName(String name){
        this.name = name;
    }
    public void changePrice(double price){
        this.price = price;
        System.out.println("Цена изменена на "+this.price);
    }
    public void changeTotalRate(int... newRate){
        for(int i: newRate){
            this.rating.add(i);
        }
    }
}
