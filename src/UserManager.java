import java.util.Scanner;

public class UserManager implements User{
    String name;
    int age;
    String login;
    String password;

    public UserManager(String name, int age, String login, String password) {
        this.name = name;
        this.age = age;
        this.login = login;
        this.password = password;
    }
    public void signIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин и пароль менеджера:");
        String Login = sc.nextLine();
        String Password = sc.nextLine();
        isSingIn(compareLogin(Login), comparePassword(Password));
    }
    public void isSingIn(boolean isLogin, boolean isPassword){
        if(isLogin&&isPassword){
            System.out.println("Вы успешно вошли как менеджер");
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
