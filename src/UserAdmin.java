public class UserAdmin {
    String name;
    String login;
    String password;

    public UserAdmin(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public void isSingIn(boolean isLogin, boolean isPassword){
        if(isLogin&&isPassword){
            System.out.println("Вы успешно вошли как администратор");
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
