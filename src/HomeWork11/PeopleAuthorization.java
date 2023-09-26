package HomeWork11;


public class PeopleAuthorization {

    public static void authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() < 20 && !login.contains(" ")) {
            System.out.println("Логин подходит ");
        }else {
            throw new WrongLoginException("Login is too long!!!");

        } if (password.length() < 20 && !password.contains(" ") && password.matches(".*\\d+.*")) {
            System.out.println("Пароль введен");
        }else {
            throw new WrongPasswordException("Check the presence of characters or the number of characters entered!!!!");

        } if (confirmPassword.length() < 20 && !confirmPassword.contains(" ") && confirmPassword.matches(".*\\d+.*")) {
            System.out.println("Повторный веден");
        } else {
            throw new WrongPasswordException("The password did not match!!!");

        } if (password.equals(confirmPassword)){
            System.out.println("Passwords match!!!");
        }else{
            throw new WrongPasswordException("Didn't match!!!");
        }
    }
}
