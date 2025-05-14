import java.util.Scanner;

public class Buyer implements User, Product{
    String name;
    int age;
    String login;
    String password;
    ProductFood product;

    public Buyer(String name, int age, String login, String password, ProductFood product) {
        this.name = name;
        this.age = age;
        this.login = login;
        this.password = password;
        this.product = product;
    }
    public void changeTotalRate(int... newRate){
        for(int i=0;i< newRate.length; i++){
            product.rating.add(newRate[i]);
        }
        double sum = 0;
        for(int i=0;i<product.rating.size();i++){
            sum+=product.rating.get(i);
        }
        double res = sum/product.rating.size();
        res = Math.round(res*100)/100.0;
        System.out.println("Рейтинг был изменён на "+res);
    }


    public void signIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин и пароль пользователя:");
        String Login = sc.nextLine();
        String Password = sc.nextLine();
        isSingIn(compareLogin(Login), comparePassword(Password));
    }
    public void isSingIn(boolean isLogin, boolean isPassword){
        if(isLogin&&isPassword){
            System.out.println("Вы успешно вошли");
        }else{
            System.out.println("Неверный логин или пароль");
        }
    }

    public boolean comparePassword(String password){
        if(this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
    public boolean compareLogin(String login){
        if(this.login.equals(login)){
            return true;
        }else{
            return false;
        }
    }
    public void changeName(String name){
        System.out.println("Пользователь предлагает название: "+name);
    }
    public void changePrice(double price){
        System.out.println("Пользователь предлагает цену: "+price);
    }

}
