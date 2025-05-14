import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductFood milk = new ProductFood("Молоко", 87, "молочные продукты");
        milk.changeTotalRate(5, 4, 5,2, 3, 5);

        ProductTech phone = new ProductTech("Телефон", 37000, "Сяоми");
        phone.changeName("Xiaomi");

        ProductClothes tShirt = new ProductClothes("Футболка", 1000, 42);
        tShirt.changePrice(1100);

        UserAdmin admin = new UserAdmin("admin", "admUs", "123a");
        System.out.println("Введите логин и пароль администратора:");
        String aLogin = sc.nextLine();
        String aPassword = sc.nextLine();
        admin.isSingIn(admin.compareLogin(aLogin), admin.comparePassword(aPassword));

        UserManager manager = new UserManager("manager", 26, "manUs", "456m");
        manager.signIn();
        SimpleUser sUser=new SimpleUser("name", 18, "address", "simUs", "789s");
        sUser.signIn();


        Buyer buyer = new Buyer("user", 19, "user12", "4321", milk);
        buyer.signIn();
        System.out.println("Введите свою оценку товара");
        int rate=sc.nextInt();
        buyer.changeTotalRate(rate);
    }
}

interface Product{
    void changeName(String name);
    void changePrice(double price);
    void changeTotalRate(int... newRate);
}

interface User{
    boolean comparePassword(String password);
    boolean compareLogin(String login);
    void isSingIn(boolean isLogin, boolean isPassword);
}