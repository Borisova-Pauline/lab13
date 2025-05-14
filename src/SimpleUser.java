import java.util.Scanner;

public class SimpleUser implements User{
    String name;
    int age;
    String address;
    String login;
    String password;

    public SimpleUser(String name, int age, String address, String login, String password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.login = login;
        this.password = password;
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
            System.out.println("Имя: "+this.name+", адрес: "+this.address);
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
}
