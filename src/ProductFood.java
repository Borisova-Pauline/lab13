import java.util.ArrayList;

public class ProductFood implements Product{
    String name;
    double price;
    String section;
    ArrayList<Integer> rating=new ArrayList<>();

    public ProductFood(String name, double price, String section) {
        this.name = name;
        this.price = price;
        this.section=section;
    }
    public void changeName(String name){
        this.name = name;
    }
    public void changePrice(double price){
        this.price = price;
    }
    public void changeTotalRate(int... newRate){
        for(int i=0;i< newRate.length; i++){
            this.rating.add(newRate[i]);
        }
        double sum = 0;
        for(int i=0;i<this.rating.size();i++){
            sum+=this.rating.get(i);
        }
        double res = sum/this.rating.size();
        res = Math.round(res*100)/100.0;
        System.out.println("Нынешний рейтнг = "+res);
    }
}
